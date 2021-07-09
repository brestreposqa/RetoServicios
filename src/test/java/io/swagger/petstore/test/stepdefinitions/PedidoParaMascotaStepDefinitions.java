package io.swagger.petstore.test.stepdefinitions;

import cucumber.api.java.es.Cuando;
import io.swagger.petstore.test.models.Pedido;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class PedidoParaMascotaStepDefinitions {

    @Cuando("^Brahian envia los datos del pedido al servicio \"([^\"]*)\"$")
    public void brahianEnviaLosDatosDelPedidoAlServicio(String url, List<Pedido> pedido) {
        String cuerpo="{\r\n" +
                "  \"id\": "+pedido.get(0).getId()+",\r\n" +
                "  \"petId\": "+pedido.get(0).getPetId()+",\r\n" +
                "  \"quantity\": "+pedido.get(0).getQuantity()+",\r\n" +
                "  \"shipDate\": \""+pedido.get(0).getShipDate()+"\",\r\n" +
                "  \"status\": \""+pedido.get(0).getStatus()+"\",\r\n" +
                "  \"complete\": "+pedido.get(0).getComplete()+"\r\n" +
                "}";

        System.out.println(cuerpo);
        SerenityRest.given().body(cuerpo).baseUri(url).header("accept","application/json").header("Content-Type","application/json").post();
    }
}
