import ammonite.ops._
load.module(cwd / "versions.scala")
@

load.ivy("com.typesafe.akka" %% "akka-actor" % Versions.akka)
@

import scala.concurrent.duration._
import akka.util._
import akka.actor._

implicit val system = ActorSystem()
