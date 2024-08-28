package com.github.leviysoft.sk

import scala.concurrent.duration.FiniteDuration
import java.time.Duration

fun FiniteDuration.toJava() {
    scala.jdk.javaapi.DurationConverters.toJava(this)
}

fun Duration.toScala() {
    scala.jdk.javaapi.DurationConverters.toScala(this)
}