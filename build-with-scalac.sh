rm -fr target
mkdir target
scalac -classpath lib/icepdf-core.jar -d target src/main/scala/*.scala
