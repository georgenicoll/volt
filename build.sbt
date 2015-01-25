lazy val commonSettings = Seq(
  organization := "org.monkeynuthead",
  version := "0.1.0",
  scalaVersion := "2.11.5"
)

lazy val junit = "junit" % "junit" % "4.12"
lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.12.1"

lazy val volt = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "volt",
    
    libraryDependencies ++= Seq(
      // Test Dependencies
      junit % Test,
      scalacheck % Test
    ),
    
    scalacOptions += "-deprecation"
    
  )
