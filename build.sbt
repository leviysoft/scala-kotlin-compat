import kotlin.Keys._

ThisBuild / scalaVersion := "3.3.3"

ThisBuild / crossScalaVersions := Seq("2.13.14", scalaVersion.value)

inThisBuild(
    List(
        sonatypeCredentialHost := "s01.oss.sonatype.org",
        sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
        organization := "io.github.leviysoft",
        homepage := Some(url("https://github.com/leviysoft/scala-kotlin-compat")),
        licenses := List("WTFPL" -> url("http://www.wtfpl.net")),
        developers := List(
            Developer(
                "danslapman",
                "Daniil Smirnov",
                "danslapman@gmail.com",
                url("https://github.com/danslapman")
            )
        )
    )
)

lazy val root = (project in file("."))
  .enablePlugins(KotlinPlugin)
  .settings(
    organization := "io.github.leviysoft",
    name := "scala-kotlin-compat",
    kotlinVersion := "1.9.25",
    kotlincJvmTarget := "11",
    kotlincOptions += "-Xjvm-default=all",
    kotlinLib("stdlib")
  )
