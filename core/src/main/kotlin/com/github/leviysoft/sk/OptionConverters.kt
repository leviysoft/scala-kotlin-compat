package com.github.leviysoft.sk

import scala.Option
import java.util.*

fun <T> Option<T>.toJava(): Optional<T> {
    return scala.jdk.javaapi.OptionConverters.toJava(this)
}

fun Option<Double>.toJavaOptionalDouble(): OptionalDouble {
    return scala.jdk.javaapi.OptionConverters.toJavaOptionalDouble(this)
}

fun Option<Int>.toJavaOptionalInt(): OptionalInt {
    return scala.jdk.javaapi.OptionConverters.toJavaOptionalInt(this)
}

fun Option<Long>.toJavaOptionalLong(): OptionalLong {
    return scala.jdk.javaapi.OptionConverters.toJavaOptionalLong(this)
}

fun <T> Optional<T>.toScala(): Option<T> {
    return scala.jdk.javaapi.OptionConverters.toScala(this)
}

fun OptionalDouble.toScala(): Option<Double> {
    return scala.jdk.javaapi.OptionConverters.toScala(this)
}

fun OptionalInt.toScala(): Option<Int> {
    return scala.jdk.javaapi.OptionConverters.toScala(this)
}

fun OptionalLong.toScala(): Option<Long> {
    return scala.jdk.javaapi.OptionConverters.toScala(this)
}