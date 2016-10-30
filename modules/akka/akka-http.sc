interp.load.module(wd / "Base.sc")
@

Seq(
  "com.typesafe.akka" %% "akka-http-core",
  "com.typesafe.akka" %% "akka-http-experimental",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental"
).map(d => interp.load.ivy(d % Versions.akka))
