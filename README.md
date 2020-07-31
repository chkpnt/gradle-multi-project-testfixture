# Run tests included in a Gradle test fixture

[Test fixtures](https://docs.gradle.org/current/userguide/java_testing.html#sec:java_test_fixtures) are commonly used to
setup the code under test, or provide utilities aimed at facilitating the tests of a component. 

But they can include tests, too. In order for them to be executed, the `testClassesDirs` of the subproject referencing 
the test fixture has to be modified.

This repo belongs to the discussion in https://twitter.com/c_otto83/status/1288133088598462467

