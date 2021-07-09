package io.swagger.petstore.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/pedidoParaMascota.feature",
        glue = "io.swagger.petstore.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class PedidoParaMascotaRunner {
}
