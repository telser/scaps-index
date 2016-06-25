lazy val root = (project in file("."))
  .settings(
    name := "scaps-index-project",
    version := "1.0",
    scalaVersion := "2.11.8",
    autoAPIMappings := true,
    //scapsControlHost in Scaps := "localhost:9000",
    libraryDependencies += "org.scala-lang" % "scala-library" % scalaVersion.value,
    libraryDependencies += "org.scala-refactoring" %% "org.scala-refactoring.library" % "0.6.2",
    //libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.1"
    //libraryDependencies += "org.spire-math" %% "spire" % "0.10.1"
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.4.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "2.4.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.4.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "2.4.7",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.0",
    (indexDependencies in Scaps) ++= Seq(
      "org.scala-lang" % "scala-library" % scalaVersion.value,
      "org.scala-refactoring" %% "org.scala-refactoring.library" % "0.6.2",
      "org.scalatest" %% "scalatest" % "2.2.6",
      "org.scalacheck" %% "scalacheck" % "1.13.0")
  )
