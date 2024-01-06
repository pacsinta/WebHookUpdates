plugins {
    kotlin("jvm") version "1.9.22"
    id("io.ktor.plugin") version "3.0.0-beta-1"
}

group = "com.cstcompany"
version = "0.0.1"

application {
    mainClass.set("com.cstcompany.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-gson-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:1.4.12")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.22")
    testImplementation("io.ktor:ktor-client-content-negotiation:2.1.1")
}

ktor {
    fatJar {
        archiveFileName.set("WebhookUpdate.jar")
    }
}