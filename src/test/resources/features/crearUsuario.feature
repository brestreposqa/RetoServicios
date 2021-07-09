#language: es
Característica: Crear Usuario

  Escenario: Creacion de usuario exitoso
    Cuando Brahian envia los siguiente datos al servicio "https://petstore.swagger.io/v2/user"
      | id     | username | firstName | lastName | email         | password | phone     | userStatus |
      | 132391 | brestrepo  | brahian   | restrepo | brahin@ho.com |     1234 | 300212121 |          0 |
    Entonces valida que el codigo de status sea 200
    Y valida que el contenido de la llave "type" sea "unknown"
    Y valida que el contenido de la llave "message" sea "132391"