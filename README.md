# ammonite-modules

ammonite-modules project defines modules you can load in Ammonite Repl. Modules will load all the dependencies needed and do some basic setup.
See [my blog post](http://yeghishe.github.io/2016/06/05/ammonite-modules.html) for more detailed description of the project.

Versions file contains all the version. Modules directory has all the modules. The idea here is that each project may have different modules and user chooses which module to load. For example:
```
├── versions.scala
├── modules
│   ├── akka
│   │   ├── akka-actor.scala
│   │   ├── akka-http.scala
│   │   └── akka-stream.scala
│   ├── cats
│   │   ├── cats-core.scala
│   │   └── cats.scala
│   ├── circe
│   │   └── circe.scala
```

To load a module run:
```
import ammonite.ops._
load.module(cwd / "modules" / "cats" / "cats-core.scala")
```

or **`loadM("cats" -> "cats-core")`** after you add following to your Ammonite predefs (`~/.ammonite/predef.scala`): 
```
import ammonite.ops._

def loadM(module: (String, String)): Unit =
  load.module(cwd / "modules" / module._1 / s"${module._2}.scala")
```

## How to contribute

* Each now project should have it's sub directory under `modules` folder and at least one scala file in it. See above how modules are named.
* `Versions` case object in `versions.scala` file should include a public val for the project with latest version.
* Add those three lines to the top of the file:

  ```
  import ammonite.ops._
  load.module(cwd / "versions.scala")
  @
  ```
* Send pull requests, be it a bug fix, improvement, upgrading a version to the latest or adding more modules. All pull requests are welcome.
