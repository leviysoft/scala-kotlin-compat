package com.github.leviysoft.sk.coroutines

import kotlinx.coroutines.AbstractCoroutine
import kotlinx.coroutines.InternalCoroutinesApi
import scala.concurrent.Promise
import kotlin.coroutines.CoroutineContext

@OptIn(InternalCoroutinesApi::class)
internal class PromiseCoroutine<T>(context: CoroutineContext, private val promise: Promise<T>): AbstractCoroutine<T>(context, initParentJob = true, active = true) {
    override fun onCompleted(value: T) {
        this.promise.success(value)
    }

    override fun onCancelled(cause: Throwable, handled: Boolean) {
        this.promise.failure(cause)
    }
}