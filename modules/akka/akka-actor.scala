import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

interp.load.ivy("com.typesafe.akka" %% "akka-actor" % Versions.akka)
@

import scala.concurrent.duration._
import akka.util._
import akka.actor._

implicit val system = ActorSystem()
