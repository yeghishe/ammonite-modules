# ammonite-modules

ammonite-modules project defines modules you can load in Ammonite Repl. Modules will load all the dependencies needed and do some basic setup.
See [my blog post](http://yeghishe.github.io/2016/06/05/ammonite-modules.html) for more detailed description of the project.

`Base.sc` file contains all the version. Modules directory has all the modules. The idea here is that each project may have different modules and user chooses which module to load. For example:
```
├── Base.sc
├── modules
│   ├── akka
│   │   ├── akka-actor.sc
│   │   ├── akka-http.sc
│   │   └── akka-stream.sc
│   ├── cats
│   │   ├── cats-core.sc
│   │   └── cats.sc
│   ├── circe
│   │   └── circe.sc
```

### To setup up, run:
```
curl https://raw.githubusercontent.com/yeghishe/ammonite-modules/master/predef.sc > ~/.ammonite/predef.sc
```
Also make sure to set `AMMONITE_MODULES` environment variable to point to the directory where you checked out `ammonite-modules`, that way you can call `loadM` no mather from what directory `amm` was launched.

### To load a module, run:

`loadM("<PROJECT>" -> "<MODULE>")` (for example, loadM("cats" -> "cats-core")) in `amm` console.

## How to contribute

* Each now project should have it's sub directory under `modules` folder and at least one scala file in it. See above how modules are named.
* `Versions` case object in `Base.sc` file should include a public val for the project with latest version.
* Add those three lines to the top of the file:

  ```
  interp.load.module(wd / "Base.sc")
  @
  ```
* Send pull requests, be it a bug fix, improvement, upgrading a version to the latest or adding more modules. All pull requests are welcome.
