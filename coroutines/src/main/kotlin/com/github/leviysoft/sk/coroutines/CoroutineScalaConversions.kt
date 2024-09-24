@file:OptIn(InternalCoroutinesApi::class, ExperimentalCoroutinesApi::class)

package com.github.leviysoft.sk.coroutines

import kotlinx.coroutines.*

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.Promise
import scala.util.Failure
import scala.util.Success
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

fun <T> CoroutineScope.scalaFuture(
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> T
) : scala.concurrent.Future<T> {
    require(!start.isLazy) { "$start start is not supported" }
    val newContext = this.newCoroutineContext(context)
    val promise = Promise.apply<T>()
    val coroutine = PromiseCoroutine(newContext, promise)
    coroutine.start(start, coroutine, block)

    return promise.future()
}

fun <T> Deferred<T>.asScalaFuture(): Future<T> {
    val promise: Promise<T> = Promise.apply()

    invokeOnCompletion {
        try {
            promise.success(getCompleted())
        } catch (t: Throwable) {
            promise.failure(t)
        }
    }

    return promise.future()
}

fun Job.asScalaFuture(): Future<scala.runtime.BoxedUnit> {
    val promise: Promise<scala.runtime.BoxedUnit> = Promise.apply()
    invokeOnCompletion { cause ->
        if (cause === null) promise.success(scala.runtime.BoxedUnit.UNIT)
        else promise.failure(cause)
    }
    return promise.future()
}

fun <T> Future<T>.asDeferred(executor: ExecutionContext): Deferred<T> {
    val result = CompletableDeferred<T>()
    this.onComplete({ res ->
        when(res) {
            is Success -> result.complete(res.value())
            is Failure -> result.completeExceptionally(res.exception())
            else -> throw IllegalStateException("Unreachable")
        }
    }, executor)
    return result
}

suspend fun <T> Future<T>.await(executor: ExecutionContext): T {
    return suspendCancellableCoroutine { cont: CancellableContinuation<T> ->
        this.onComplete({ res ->
            when(res) {
                is Success -> cont.resume(res.value())
                is Failure -> cont.resumeWithException(res.exception())
                else -> throw IllegalStateException("Unreachable")
            }
        }, executor)
    }
}