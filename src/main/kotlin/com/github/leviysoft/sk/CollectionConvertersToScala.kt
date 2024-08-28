package com.github.leviysoft.sk

import java.util.*
import java.util.concurrent.ConcurrentMap

fun <T> Iterator<T>.asScala() {
    scala.jdk.CollectionConverters.IteratorHasAsScala(this).asScala()
}

fun <T> Enumeration<T>.asScala() {
    scala.jdk.CollectionConverters.EnumerationHasAsScala(this).asScala()
}

fun <T> Iterable<T>.asScala() {
    scala.jdk.CollectionConverters.IterableHasAsScala(this).asScala()
}

fun <T> Collection<T>.asScala() {
    scala.jdk.CollectionConverters.CollectionHasAsScala(this).asScala()
}

fun <T> List<T>.asScala() {
    scala.jdk.CollectionConverters.ListHasAsScala(this).asScala()
}

fun <T> Set<T>.asScala() {
    scala.jdk.CollectionConverters.SetHasAsScala(this).asScala()
}

fun <K, V> Map<K, V>.asScala() {
    scala.jdk.CollectionConverters.MapHasAsScala(this).asScala()
}

fun <K, V> ConcurrentMap<K, V>.asScala() {
    scala.jdk.CollectionConverters.ConcurrentMapHasAsScala(this).asScala()
}

fun <K, V> Dictionary<K, V>.asScala() {
    scala.jdk.CollectionConverters.DictionaryHasAsScala(this).asScala()
}

fun Properties.asScala() {
    scala.jdk.CollectionConverters.PropertiesHasAsScala(this).asScala()
}