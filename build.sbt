import build.Build

val scalajs = Build.root
val ir = Build.irProject
val irJS = Build.irProjectJS
val compiler = Build.compiler
val linkerInterface = Build.linkerInterface
val linkerInterfaceJS = Build.linkerInterfaceJS
val linkerPrivateLibrary = Build.linkerPrivateLibrary
val linker = Build.linker
val linkerJS = Build.linkerJS
val testAdapter = Build.testAdapter
val sbtPlugin = Build.plugin
val javalanglib = Build.javalanglib
val javalib = Build.javalib
val scalalib = Build.scalalib
val libraryAux = Build.libraryAux
val library = Build.library
val testInterface = Build.testInterface
val testBridge = Build.testBridge
val jUnitRuntime = Build.jUnitRuntime
val jUnitTestOutputsJS = Build.jUnitTestOutputsJS
val jUnitTestOutputsJVM = Build.jUnitTestOutputsJVM
val jUnitPlugin = Build.jUnitPlugin
val jUnitAsyncJS = Build.jUnitAsyncJS
val jUnitAsyncJVM = Build.jUnitAsyncJVM
val helloworld = Build.helloworld
val reversi = Build.reversi
val testingExample = Build.testingExample
val testSuite = Build.testSuite
val testSuiteJVM = Build.testSuiteJVM
val javalibExtDummies = Build.javalibExtDummies
val testSuiteEx = Build.testSuiteEx
val testSuiteExJVM = Build.testSuiteExJVM
val testSuiteLinker = Build.testSuiteLinker
val partest = Build.partest
val partestSuite = Build.partestSuite
val scalaTestSuite = Build.scalaTestSuite

inThisBuild(Build.thisBuildSettings)

lazy val sharedSettings = Seq(
  libraryDependencies ++= Seq(
        "com.beachape" %% "enumeratum" % "1.7.0",
        "com.chuusai" %% "shapeless" % "2.3.7",
        "com.github.fridujo" % "rabbitmq-mock" % "1.1.1",
        "com.github.fridujo" % "spring-automocker" % "1.2.1",
        "com.github.javafaker" % "javafaker" % "1.0.2",
        "com.github.julien-truffaut" %% "monocle-core" % "2.1.0",
        "com.github.julien-truffaut" %% "monocle-macro" % "2.1.0",
        "com.github.tminglei" %% "slick-pg" % "0.19.7",
        "com.rms.miu" %% "slick-cats" % "0.10.4",
        "com.typesafe" % "config" % "1.4.0",
        "com.typesafe.slick" %% "slick" % "3.3.3",
        "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3",
        "io.micrometer" % "micrometer-core" % "1.7.5",
        "io.micrometer" % "micrometer-registry-prometheus" % "1.7.5",
        "org.drools" % "drools-canonical-model" % "7.72.0.Final",
        "org.drools" % "drools-model-compiler" % "7.72.0.Final",
        "org.kie" % "kie-ci" % "7.72.0.Final",
        "org.postgresql" % "postgresql" % "42.3.1",
        "org.scalatest" %% "scalatest" % "3.2.10" % "test",
        "org.springframework" % "spring-messaging" % "5.2.20.RELEASE",
        "org.springframework.amqp" % "spring-rabbit" % "2.4.4",
        "org.springframework.boot" % "spring-boot-starter" % "2.6.7",
        "org.springframework.boot" % "spring-boot-starter-actuator" % "2.6.7",
        "org.springframework.boot" % "spring-boot-starter-test" % "2.6.7",
        "org.springframework.boot" % "spring-boot-starter-web" % "2.6.7",
        "org.typelevel" %% "cats-core" % "2.6.1",
        "io.monix" %% "monix" % "3.4.0",
        "com.softwaremill.diffx" %% "diffx-core" % "0.6.0"
      ) ++ circeDeps,
  excludeDependencies ++= Seq(
        ExclusionRule("org.springframework.boot", "spring-boot-starter-logging"),
        ExclusionRule("com.vaadin.external.google", "android-json")
      )
)
