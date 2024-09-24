package com.github.leviysoft.sk

import scala.collection.mutable.Buffer
import java.util.*
import java.util.concurrent.ConcurrentMap

fun <T> Iterator<T>.asScala(): scala.collection.Iterator<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <T> Enumeration<T>.asScala(): scala.collection.Iterator<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <T> Iterable<T>.asScala(): scala.collection.Iterable<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <T> Collection<T>.asScala(): scala.collection.Iterable<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <T> List<T>.asScala(): Buffer<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <T> Set<T>.asScala(): scala.collection.mutable.Set<T> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <K, V> Map<K, V>.asScala(): scala.collection.mutable.Map<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <K, V> ConcurrentMap<K, V>.asScala(): scala.collection.concurrent.Map<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun <K, V> Dictionary<K, V>.asScala(): scala.collection.mutable.Map<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}

fun Properties.asScala(): scala.collection.mutable.Map<String, String> {
    return scala.jdk.javaapi.CollectionConverters.asScala(this)
}