
interp.load.ivy("com.lihaoyi" % s"ammonite-shell_${scala.util.Properties.versionNumberString}" % ammonite.Constants.version)
@
val shellSession = ammonite.shell.ShellSession()
import shellSession._
import ammonite.ops._
import ammonite.shell._
//ammonite.shell.Configure(interp, repl, wd)

def loadM(module: (String, String), ammoniteModules: Option[Path] = None): Unit = {
  import ammonite.ops.PathConvertible._
  val p = ammoniteModules.orElse(scala.sys.env.get("AMMONITE_MODULES").map(s => Path(s))).getOrElse(cwd)
  val c = cwd
  cd!(p)
  interp.load.module(wd / "modules" / module._1 / s"${module._2}.sc")
  cd!(c)
}
