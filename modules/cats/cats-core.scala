import ammonite.ops._
interp.load.module(cwd / "versions.scala")
@

interp.load.ivy("org.typelevel" %% "cats-core" % Versions.cats)
