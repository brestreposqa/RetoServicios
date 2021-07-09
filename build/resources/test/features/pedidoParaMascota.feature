#language: es
Característica: Hacer pedido

  Escenario: Hacer pedido para una mascota
    Cuando Brahian envia los datos del pedido al servicio "https://petstore.swagger.io/v2/store/order"
      | id    | petId | quantity | shipDate                 | status | complete |
      | 15489 |   254 |       52 | 2021-07-08T20:29:17.115Z | placed | true     |
    Entonces valida que el codigo de status sea 200
    Y valida que el contenido de la llave "status" sea "placed"
