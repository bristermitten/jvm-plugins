lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.5"
    )),
    name := "MyPlugin",
    resolvers += "spigot-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/",
    libraryDependencies += "org.spigotmc" % "spigot-api" % "1.12.2-R0.1-SNAPSHOT" % "provided" intransitive(),
    version := "1.0"
  )
