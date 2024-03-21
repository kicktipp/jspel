plugins {
	java
	war
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "org.kicktipp"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	providedCompile("org.apache.tomcat.embed:tomcat-embed-jasper")
	implementation("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api")
	implementation("org.glassfish.web:jakarta.servlet.jsp.jstl")

	// uncomment this line to speed things up
	implementation("net.sargue:java-time-jsptags:2.0.0")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
