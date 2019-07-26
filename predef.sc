
interp.load.ivy("com.lihaoyi" % s"ammonite-shell_${scala.util.Properties.versionNumberString}" % ammonite.Constants.version)
@
val shellSession = ammonite.shell.ShellSession()
import shellSession._
import ammonite.ops._
import ammonite.shell._

def loadM(module: (String, String), ammoniteModules: Option[Path] = None): Unit = {
  val p = ammoniteModules.orElse(scala.sys.env.get("AMMONITE_MODULES").map(s => Path(s))).getOrElse(pwd)
  val c = pwd
  cd!(p)
  interp.load.module(wd / "modules" / module._1 / s"${module._2}.sc")
  cd!(c)
}
