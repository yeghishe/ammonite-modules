import ammonite.ops._
load.module(cwd / "versions.scala")
@

load.ivy("org.scalaz" %% "scalaz-core" % Versions.scalaz)
@

import scalaz._
import Scalaz._
