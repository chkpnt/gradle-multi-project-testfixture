plugins {
    `java-platform`
}

dependencies {
    constraints {
        api("com.google.guava:guava:29.0-jre")
        api("org.junit.jupiter:junit-jupiter-api:5.6.2")
        api("org.junit.jupiter:junit-jupiter-engine:5.6.2")
        api ("org.hamcrest:hamcrest:2.2")
        api("com.tngtech.archunit:archunit:0.14.1")
    }
}