plugins {
    `java-library`
}

dependencies {
    api(platform(project(":platform")))

    implementation("com.google.guava:guava")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.hamcrest:hamcrest")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly(testFixtures(project(":common-arch-tests")))
}

val test by tasks.getting(Test::class) {
    testClassesDirs += project(":common-arch-tests").sourceSets.get("testFixtures").output.classesDirs
}
