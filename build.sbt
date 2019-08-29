name := "com.hmrc.test.Application"

version := "0.1"
scalaVersion := "2.11.11"
libraryDependencies++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
}
fork in Test := true
