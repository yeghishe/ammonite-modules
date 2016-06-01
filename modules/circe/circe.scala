import ammonite.ops._
load.module(cwd / "versions.scala")
@

Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(d => load.ivy(d % Versions.circe))
@

import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
