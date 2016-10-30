interp.load.module(wd / "Base.sc")
@

interp.load.ivy("com.propensive" %% "rapture" % Versions.rapture)
@

import rapture._
import rapture.core._
import rapture.io._
import rapture.codec._
import rapture.json._
