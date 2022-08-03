plugins {
    id("java")
}

group = "com.zzx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation("cglib:cglib:3.3.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}