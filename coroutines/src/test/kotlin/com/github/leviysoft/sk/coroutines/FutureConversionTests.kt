package com.github.leviysoft.sk.coroutines

import kotlinx.coroutines.runBlocking
import scala.concurrent.ExecutionContext
import scala.concurrent.`Future$`
import kotlin.test.Test
import kotlin.test.assertEquals

class FutureConversionTests {
    @Test
    fun awaitFutureTest() {
        val future = `Future$`.`MODULE$`.successful(42)

        val result = runBlocking {
            future.await(ExecutionContext.global())
        }

        assertEquals(42, result)
    }
}