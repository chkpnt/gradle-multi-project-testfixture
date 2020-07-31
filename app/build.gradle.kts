plugins {
    java
    application
}

dependencies {
    implementation(platform(project(":platform")))

    implementation(project(":lib1"))
    implementation(project(":lib2"))
    implementation("com.google.guava:guava")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.hamcrest:hamcrest")
}

application {
    mainClassName = "de.chkpnt.playground.app.App"
}
