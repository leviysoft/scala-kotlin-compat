package com.github.leviysoft.sk

import java.util.concurrent.CompletionStage
import scala.concurrent.Future

fun <T> Future<T>.asJava() {
    scala.jdk.javaapi.FutureConverters.asJava(this)
}

fun <T> CompletionStage<T>.asScala() {
    scala.jdk.javaapi.FutureConverters.asScala(this)
}