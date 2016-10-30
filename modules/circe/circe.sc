interp.load.module(wd / "Base.sc")
@

Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(d => interp.load.ivy(d % Versions.circe))
@

import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
