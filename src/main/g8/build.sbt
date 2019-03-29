name := "$name;format="lower,hyphen"$"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-Ypartial-unification"   // allow the compiler to unify type constructors of different arities
)

libraryDependencies += "org.typelevel" %% "cats-core" % "1.6.0"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.9")
