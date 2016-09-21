import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

Seq(
  "com.typesafe.akka" %% "akka-http-core",
  "com.typesafe.akka" %% "akka-http-experimental",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental"
).map(d => interp.load.ivy(d % Versions.akka))
