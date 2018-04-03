sbtPlugin := true
organization in ThisBuild := "com.github.luchesar"

name := "sbt-leak-prevention"
publishMavenStyle := true


libraryDependencies ++= Seq(
  "se.jiderhamn.classloader-leak-prevention" % "classloader-leak-prevention-core" % "2.6.0"
)

scalaVersion := "2.12.5"

pomExtra in Global := {
  <url>https://github.com/dwickern/sbt-classloader-leak-prevention</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/luchesar/sbt-leak-prevention.git</connection>
      <developerConnection>scm:git:git@github.com:luchesar/sbt-leak-prevention.git</developerConnection>
      <url>github.com/luchesar/sbt-leak-prevention.git</url>
    </scm>
    <developers>
      <developer>
        <id>luchesar</id>
        <name>Luchesar Cekov</name>
        <url>https://github.com/luchesar</url>
      </developer>
    </developers>
}

sonatypeProfileName := "Luchesar Cekov"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// License of your choice
licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

// Where is the source code hosted
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("luchesar", "sbt-leak-prevention", "luchesar@gmail.com"))

// or if you want to set these fields manually
homepage := Some(url("https://github.com/luchesar/sbt-leak-prevention"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/luchesar/sbt-leak-prevention.git"),
    "scm:git:github.com/luchesar/sbt-leak-prevention.git"
  )
)
developers := List(
  Developer(id="luchesar", name="Luchesar Cekov", email="luchesar@gmail.com", url=url("https://github.com/luchesar"))
)

