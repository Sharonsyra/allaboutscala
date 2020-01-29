name := "allaboutscala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq (
    "org.apache.spark" %% "spark-sql" % "2.4.3",
    "org.scalatest" %% "scalatest" % "3.0.1" % Test,
    "log4j" % "log4j" % "1.2.17",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "joda-time" % "joda-time" % "2.9.3",
    "org.joda" % "joda-convert" % "1.8"
)

