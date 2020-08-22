cd common/ || exit
./gradlew publishToMavenLocal
cd ../

cd clojure-plugin/ || exit
lein uberjar
cd ../

cd groovy/ || exit
./gradlew shadowJar
cd ../

cd java/ || exit
./gradlew build
cd ../

cd kotlin/ || exit
./gradlew shadowJar
cd ../

cd scala/ || exit
sbt assembly
cd ../
