package com.utest.reto.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automatizacionUtest.feature",
        tags = "@stories",
        glue = "com.utest.reto.automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
