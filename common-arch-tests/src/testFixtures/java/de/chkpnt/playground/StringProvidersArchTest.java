package de.chkpnt.playground;

import com.tngtech.archunit.base.Optional;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class StringProvidersArchTest {

    private JavaClasses importedClasses = new ClassFileImporter().importPackages("de.chkpnt");

    @Test
    void testAllStringProvidersHaveAMethodGetString() {
        classes().that().haveNameMatching(".*String.*Provider")
                .should(haveAMethodGetString())
                .check(importedClasses);
    }

    private static ArchCondition<JavaClass> haveAMethodGetString() {

        return new ArchCondition<JavaClass>("have a method 'String getString()'") {

            @Override
            public void check(JavaClass item, ConditionEvents events) {
                Optional<JavaMethod> getStringMethod = item.tryGetMethod("getString");
                if (! getStringMethod.isPresent()) {
                    String message = String.format("Class %s has no method getString()", item.getName());
                    events.add(SimpleConditionEvent.violated(item, message));
                    return;
                }

                if (! getStringMethod.get().getRawReturnType().isEquivalentTo(String.class)) {
                    String message = String.format("Method getString() in class %s has wrong return type", item.getName());
                    events.add(SimpleConditionEvent.violated(item, message));
                    return;
                }
            }
        };
    }
}
