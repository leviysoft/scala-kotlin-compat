import kotlin.Keys._

ThisBuild / scalaVersion := "3.3.4"

ThisBuild / crossScalaVersions := Seq("2.13.15", scalaVersion.value)

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

lazy val core = (project in file("core"))
  .enablePlugins(KotlinPlugin)
  .settings(
      organization := "io.github.leviysoft",
      name := "scala-kotlin-compat",
      kotlinVersion := "1.9.25",
      kotlincJvmTarget := "11",
      kotlincOptions += "-Xjvm-default=all",
      kotlinLib("stdlib")
  )

lazy val coroutines = (project in file("coroutines"))
  .enablePlugins(KotlinPlugin)
  .settings(
    organization := "io.github.leviysoft",
    name := "scala-kotlin-coroutines-compat",
    kotlinVersion := "1.9.25",
    kotlincJvmTarget := "11",
    kotlincOptions += "-Xjvm-default=all",
    kotlinLib("stdlib"),
    libraryDependencies ++= Seq(
      "org.jetbrains.kotlinx" % "kotlinx-coroutines-core" % "1.8.1",
      "com.github.sbt" % "junit-interface" % "0.13.3" % Test,
      "org.jetbrains.kotlin" % "kotlin-test-junit" % kotlinVersion.value % Test
    )
  )

lazy val root = (project in file("."))
  .dependsOn(core, coroutines)
  .aggregate(core, coroutines)
  .settings(
      crossScalaVersions := Nil,
      publish := {},
      publishArtifact := false,
      publish / skip := true
  )
