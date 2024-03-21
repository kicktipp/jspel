# Test without java-time-jsptags:

check dependency in build.gradle.kts is not included

Start war

$ ./gradlew clean build; java -jar build/libs/jspel-0.0.1-SNAPSHOT.war

Warm up

$ ab -n 1000 -c 1 'http://localhost:8080/hello'

Test

$ ab -n 1000 -c 50 'http://localhost:8080/hello'

# Test with java-time-jsptags:

quit java Process with Ctrl-C

uncomment dependency in build.gradle.kts 
  implementation("net.sargue:java-time-jsptags:2.0.0")

# Results (more is better)

Results *without* java-time-jsptags: 18379.65 request/s

Results *with* java-time-jsptags:      512.50 request/s

# Bug description regarding glassfisch EL implememtation

https://bz.apache.org/bugzilla/show_bug.cgi?id=57583

https://vivekvara.medium.com/jsp-performance-degrades-from-spring-boot-2-3-x-for-undefined-attributes-8cb434f743c2

