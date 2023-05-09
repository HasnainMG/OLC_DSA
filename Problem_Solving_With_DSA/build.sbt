ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "Problem_Solving_With_DSA"
  )
// https://mvnrepository.com/artifact/com.opencsv/opencsv
libraryDependencies += "com.opencsv" % "opencsv" % "5.7.1"
