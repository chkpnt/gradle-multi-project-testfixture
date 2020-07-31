subprojects {
    repositories {
        jcenter()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}