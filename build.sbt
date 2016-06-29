import _root_.sbt.Keys._

name := "sparkUtil"
version := "1.0"
scalaVersion := "2.11.8"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % sparkVersion
)