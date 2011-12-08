import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val akkaRepo   = "Akka Repo" at "http://akka.io/repository"
  val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.2"
  
  val ideaSbtRepo= "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdeaPlugin = "com.github.mpeltonen" %% "sbt-idea" % "0.4.0"
}