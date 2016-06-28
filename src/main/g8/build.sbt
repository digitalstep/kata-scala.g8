name         := "$name;format="normalize"$"
scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalacheck"      %% "scalacheck"    % "1.12.5" % Test,
  "org.scalatest"       %% "scalatest"     % "2.2.6"  % Test
)
