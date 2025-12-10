package com.clean.code;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.clean.code")
public class ArchitectureTest {

    // ❌ Esta sí detecta tus campos públicos reales y FALLA
    @ArchTest
    static final ArchRule no_public_fields =
            fields()
                    .should().notBePublic()
                    .because("Los atributos públicos violan encapsulamiento");


    // ❌ Esta regla detecta si existen clases sin nombre correcto
    @ArchTest
    static final ArchRule classes_should_end_with_Manager =
            classes().that().resideInAPackage("com.clean.code")
                    .and().doNotHaveSimpleName("ArchitectureTest")
                    .should().haveSimpleNameEndingWith("Manager")
                    .because("Las clases de producción deben terminar en 'Manager'");
}
