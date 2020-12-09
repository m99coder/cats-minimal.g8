name := "$name;format="lower,hyphen"$"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.4"

scalacOptions ++= Seq(
  "-Ypartial-unification"   // allow the compiler to unify type constructors of different arities
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core"   % "2.3.0",
  "org.typelevel" %% "cats-effect" % "2.3.0"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
