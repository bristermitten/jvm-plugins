lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.13.3"
    )),
    name := "Scala-Plugin",
    resolvers += Resolver.mavenLocal,
    libraryDependencies += "org.spigotmc" % "spigot-api" % "1.16.1-R0.1-SNAPSHOT" % "provided" intransitive(),
    libraryDependencies += "me.bristermitten" % "common" % "1.0-SNAPSHOT",
    version := "1.0"
  )
