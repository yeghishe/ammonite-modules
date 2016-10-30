interp.load.module(wd / "Base.sc")
@

interp.load.ivy("com.propensive" %% "rapture-json-circe" % Versions.rapture)
@

import rapture.json._
import rapture.json.jsonBackends.circe._
import rapture.json.formatters.compact._
