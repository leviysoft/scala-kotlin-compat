package com.github.leviysoft.sk

fun <T> scala.collection.Iterator<T>.asJava() {
    scala.jdk.CollectionConverters.IteratorHasAsJava(this).asJava()
}

fun <T> scala.collection.Iterator<T>.asJavaEnumeration() {
    scala.jdk.CollectionConverters.IteratorHasAsJava(this).asJavaEnumeration()
}

fun <T> scala.collection.Iterable<T>.asJava() {
    scala.jdk.CollectionConverters.IterableHasAsJava(this).asJava()
}

fun <T> scala.collection.Iterable<T>.asJavaCollection() {
    scala.jdk.CollectionConverters.IterableHasAsJava(this).asJavaCollection()
}

fun <T> scala.collection.mutable.Buffer<T>.asJava() {
    scala.jdk.CollectionConverters.BufferHasAsJava(this).asJava()
}

fun <T> scala.collection.mutable.Seq<T>.asJava() {
    scala.jdk.CollectionConverters.MutableSeqHasAsJava(this).asJava()
}

fun <T> scala.collection.Seq<T>.asJava() {
    scala.jdk.CollectionConverters.SeqHasAsJava(this).asJava()
}

fun <T> scala.collection.mutable.Set<T>.asJava() {
    scala.jdk.CollectionConverters.MutableSetHasAsJava(this).asJava()
}

fun <T> scala.collection.Set<T>.asJava() {
    scala.jdk.CollectionConverters.SetHasAsJava(this).asJava()
}

fun <K, V> scala.collection.mutable.Map<K, V>.asJava() {
    scala.jdk.CollectionConverters.MutableMapHasAsJava(this).asJava()
}

fun <K, V> scala.collection.mutable.Map<K, V>.asJavaDictionary() {
    scala.jdk.CollectionConverters.MutableMapHasAsJava(this).asJavaDictionary()
}

fun <K, V> scala.collection.Map<K, V>.asJava() {
    scala.jdk.CollectionConverters.MapHasAsJava(this).asJava()
}

fun <K, V> scala.collection.concurrent.Map<K, V>.asJava() {
    scala.jdk.CollectionConverters.ConcurrentMapHasAsJava(this).asJava()
}