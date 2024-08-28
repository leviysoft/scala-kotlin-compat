package com.github.leviysoft.sk

import java.util.concurrent.CompletionStage
import scala.concurrent.Future

fun <T> Future<T>.asJava(): CompletionStage<T> {
    return scala.jdk.javaapi.FutureConverters.asJava(this)
}

fun <T> CompletionStage<T>.asScala(): Future<T> {
    return scala.jdk.javaapi.FutureConverters.asScala(this)
}