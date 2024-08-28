# scala-kotlin-compat

A missing compatibility bridge between Scala & Kotlin

This library exposes all conversions included in Scala standard library as Kotlin's extension methods

All you need to do is:
- add dependency to `io.github.leviysoft:scala-kotlin-compat_2.13:<version>` or `io.github.leviysoft:scala-kotlin-compat_3:<version>` depending to Scala version in you project
- import `com.github.leviysoft.sk.*`
- call `asJava` \ `asScala` \ `toJava` \ `toScala` methods