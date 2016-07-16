name := "HelloWorld"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

addCommandAlias("checks", ";clean;compile;coverage;test;coverageOff;coverageReport")
