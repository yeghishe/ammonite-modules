import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

interp.load.ivy("org.scalaz" %% "scalaz-core" % Versions.scalaz)
@

import scalaz._
import Scalaz._
