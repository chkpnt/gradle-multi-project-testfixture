plugins {
    `java-library`
    `java-test-fixtures`
}

dependencies {
    api(platform(project(":platform")))

    testFixturesImplementation("org.junit.jupiter:junit-jupiter-api")
    testFixturesImplementation("org.hamcrest:hamcrest")
    testFixturesImplementation("com.tngtech.archunit:archunit")

    testFixturesRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}