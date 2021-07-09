package io.swagger.petstore.test.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.swagger.petstore.test.models.Usuario;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.util.List;

public class CrearUsuarioStepDefinitions {

    @Cuando("^Brahian envia los siguiente datos al servicio \"([^\"]*)\"$")
    public void brahianEnviaLosSiguienteDatosAlServicio(String url, List<Usuario> user) {
        String cuerpo="{\r\n" +
                "  \"id\": "+user.get(0).getId()+",\r\n" +
                "  \"username\": \""+user.get(0).getUsername()+"\",\r\n" +
                "  \"firstName\": \""+user.get(0).getFirstName()+"\",\r\n" +
                "  \"lastName\": \""+user.get(0).getLastName()+"\",\r\n" +
                "  \"email\": \""+user.get(0).getEmail()+"\",\r\n" +
                "  \"password\": \""+user.get(0).getPassword()+"\",\r\n" +
                "  \"phone\": \""+user.get(0).getPhone()+"\",\r\n" +
                "  \"userStatus\": "+user.get(0).getUserStatus()+"\r\n" +
                "}";

        SerenityRest.given().body(cuerpo).baseUri(url).header("accept","application/json").header("Content-Type","application/json").post();
    }

    @Entonces("^valida que el codigo de status sea (\\d+)$")
    public void validaQueElCodigoDeStatusSea(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
    }

    @Entonces("^valida que el contenido de la llave \"([^\"]*)\" sea \"([^\"]*)\"$")
    public void validaQueElContenidoDeLaLlaveSea(String llaveResultado, String resultadoEsperado) {
        SerenityRest.lastResponse().then().body(llaveResultado, Matchers.equalTo(resultadoEsperado));
    }

}
