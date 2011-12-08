import sbt._

class TutorialOneProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject {
  val akkaRepo   = "Akka Repo" at "http://akka.io/repository"

  override def libraryDependencies = Set(
    "se.scalablesolutions.akka" % "akka-actor"         % "1.2"   % "compile->default"
  ) ++ super.libraryDependencies
}


