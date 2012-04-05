name := "abell"

version := "0.1-SNAPSHOT"

organization := "org.abell2029"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.apache.zookeeper" % "zookeeper" % "3.4.3" excludeAll(
    ExclusionRule(organization = "com.sun.jdmk"),
    ExclusionRule(organization = "com.sun.jmx"),
    ExclusionRule(organization = "javax.jms")
  ) 
)
