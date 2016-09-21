import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

interp.load.ivy("com.typesafe.akka" %% "akka-stream" % Versions.akka)
@

import scala.concurrent.duration._
import akka.util._
import akka.actor._
import akka.stream._
import akka.stream.scaladsl._

implicit val system = ActorSystem()
implicit val materializer = ActorMaterializer()
