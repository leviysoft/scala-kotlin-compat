package com.github.leviysoft.sk

import java.util.*
import java.util.concurrent.ConcurrentMap

fun <T> scala.collection.Iterator<T>.asJava(): MutableIterator<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.Iterator<T>.asJavaEnumeration(): Enumeration<T> {
    return scala.jdk.javaapi.CollectionConverters.asJavaEnumeration(this)
}

fun <T> scala.collection.Iterable<T>.asJava(): MutableIterable<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.Iterable<T>.asJavaCollection(): MutableCollection<T> {
    return scala.jdk.javaapi.CollectionConverters.asJavaCollection(this)
}

fun <T> scala.collection.mutable.Buffer<T>.asJava(): MutableList<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.mutable.Seq<T>.asJava(): MutableList<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.Seq<T>.asJava(): MutableList<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.mutable.Set<T>.asJava(): MutableSet<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <T> scala.collection.Set<T>.asJava(): MutableSet<T> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <K, V> scala.collection.mutable.Map<K, V>.asJava(): MutableMap<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <K, V> scala.collection.mutable.Map<K, V>.asJavaDictionary(): Dictionary<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asJavaDictionary(this)
}

fun <K, V> scala.collection.Map<K, V>.asJava(): MutableMap<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}

fun <K, V> scala.collection.concurrent.Map<K, V>.asJava(): ConcurrentMap<K, V> {
    return scala.jdk.javaapi.CollectionConverters.asJava(this)
}