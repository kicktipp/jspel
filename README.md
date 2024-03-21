https://bz.apache.org/bugzilla/show_bug.cgi?id=57583
https://vivekvara.medium.com/jsp-performance-degrades-from-spring-boot-2-3-x-for-undefined-attributes-8cb434f743c2

# ----------------------------------
# Run performance test
# ----------------------------------
# 1. Test without java-time-jsptags:
# ----------------------------------
# start war
./gradlew clean build; java -jar build/libs/jspel-0.0.1-SNAPSHOT.war
# warm up
ab -n 1000 -c 1 'http://localhost:8080/hello'
# test
ab -n 1000 -c 50 'http://localhost:8080/hello'

# ----------------------------------
# 2. Test with java-time-jsptags:
# ----------------------------------
# quit java Process with Ctrl-C
# uncomment dependency in build.gradle.kts 
# implementation("net.sargue:java-time-jsptags:2.0.0")

# ----------------------------------
# Results
# ----------------------------------
Results *without* java-time-jsptags: 18379.65 request/s
Results *with* java-time-jsptags:      512.50 request/s


