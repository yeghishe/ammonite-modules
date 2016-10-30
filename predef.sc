interp.load.ivy("com.lihaoyi" %% "ammonite-shell" % ammonite.Constants.version)
@
val shellSession = ammonite.shell.ShellSession()
import shellSession._
import ammonite.shell.PPrints._
import ammonite.ops._
import ammonite.shell._
ammonite.shell.Configure(repl, wd)

def loadM(module: (String, String), ammoniteModules: Option[Path] = None): Unit = {
  val p = ammoniteModules.orElse(scala.sys.env.get("AMMONITE_MODULES").map(Path)).getOrElse(cwd)
  val c = cwd
  cd!(p)
  interp.load.module(wd / "modules" / module._1 / s"${module._2}.sc")
  cd!(c)
}
