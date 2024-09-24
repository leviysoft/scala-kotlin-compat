package com.github.leviysoft.sk

import scala.concurrent.duration.FiniteDuration
import java.time.Duration

fun FiniteDuration.toJava(): Duration {
    return scala.jdk.javaapi.DurationConverters.toJava(this)
}

fun Duration.toScala(): FiniteDuration {
    return scala.jdk.javaapi.DurationConverters.toScala(this)
}