interp.load.module(wd / "Base.sc")
@

interp.load.ivy("io.monix" %% "monix" % Versions.monix)
@

import scala.concurrent.duration._

import monix.execution.Scheduler.Implicits.global
import monix.eval._
import monix.reactive._
