import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

interp.load.ivy("com.propensive" %% "rapture-json-circe" % Versions.rapture)
@

import rapture.json._
import rapture.json.jsonBackends.circe._
import rapture.json.formatters.compact._
