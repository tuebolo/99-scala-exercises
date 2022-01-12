scalaVersion := "3.1.0"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.10" % Test,
  "org.scalatest" %% "scalatest-funsuite" % "3.2.10" % Test
)
scalacOptions ++= Seq(
  "-explain",
  "-explain-types",
  "-deprecation"
)
turbo := true