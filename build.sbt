name := "Security"

version := "1.0"

organization := "com.rew3"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "1.3.3",
  "joda-time" % "joda-time" % "2.7",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalatestplus" %% "play" % "1.4.0-M3" % "test",
  "org.sangria-graphql" %% "sangria-circe" % "1.2.0"
)

lazy val rew3GQL = (project in file(".")).enablePlugins(PlayScala)