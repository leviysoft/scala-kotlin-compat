# scala-kotlin-compat

A missing compatibility bridge between Scala & Kotlin

This library exposes conversions included in Scala standard library as Kotlin's extension methods

All you need to do is:
- add dependency to `io.github.leviysoft:scala-kotlin-compat_2.13:<version>` or `io.github.leviysoft:scala-kotlin-compat_3:<version>` depending to Scala version in you project
- import `com.github.leviysoft.sk.*`
- call `asJava` \ `asScala` \ `toJava` \ `toScala` methods

The following components of `scala.jdk` are implemented:
- [x] CollectionConverters
- [x] DurationConverters
- [x] FunctionConverters
- [x] FutureConverters
- [x] OptionConverters
- [ ] StreamConverters

In addition, `scala-kotlin-coroutines-compat` provides utilities for calling `suspend fun`s as `Future`s