cd common
call gradlew publishToMavenLocal

cd ../clojure-plugin

call lein uberjar

cd ../groovy

call gradlew shadowJar

cd ../java

call gradlew build

cd ../kotlin

call gradlew shadowJar

cd ../scala

call sbt assembly
cd ../
