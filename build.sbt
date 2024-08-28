import kotlin.Keys._

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

ThisBuild / crossScalaVersions := Seq("2.13.14", scalaVersion.value)

lazy val root = (project in file("."))
  .enablePlugins(KotlinPlugin)
  .settings(
    organization := "io.github.leviysoft",
    name := "scala-kotlin-compat",
    kotlinVersion := "1.9.25",
    kotlincJvmTarget := "11",
    kotlinLib("stdlib")
  )
