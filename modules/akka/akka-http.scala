import ammonite.ops._
load.module(cwd / "versions.scala")
@

Seq(
  "com.typesafe.akka" %% "akka-http-core",
  "com.typesafe.akka" %% "akka-http-experimental",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental"
).map(d => load.ivy(d % Versions.akka))
