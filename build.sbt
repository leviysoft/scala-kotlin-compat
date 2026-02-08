import kotlin.Keys._

ThisBuild / scalaVersion := "3.3.7"

ThisBuild / crossScalaVersions := Seq("2.13.18", scalaVersion.value)

inThisBuild(
    List(
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
      kotlinVersion := "2.3.10",
      kotlincJvmTarget := "11",
      kotlinLib("stdlib"),
      autoScalaLibrary := true,
      crossPaths := true
  )

lazy val coroutines = (project in file("coroutines"))
  .enablePlugins(KotlinPlugin)
  .settings(
    organization := "io.github.leviysoft",
    name := "scala-kotlin-coroutines-compat",
    kotlinVersion := "2.3.10",
    kotlincJvmTarget := "11",
    kotlinLib("stdlib"),
    autoScalaLibrary := true,
    crossPaths := true,
    libraryDependencies ++= Seq(
      "org.jetbrains.kotlinx" % "kotlinx-coroutines-core" % "1.10.2",
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
