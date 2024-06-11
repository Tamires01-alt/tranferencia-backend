Execute seu aplicativo Spring Boot e navegue até o seguinte URL em seu navegador:
  http://localhost:8080/transfers

Adicionando os seguintes paramentros: 
{
  "sourceAccount": "333333",
  "destinationAccount": "6666666",
  "amount": 1000.00,
  "transferDate": "2024-07-01"
}

Para acessar o banco de dados execute : 
http://localhost:8080/h2-console

url: jdbc:h2:mem:mydb
  username: sa
  password: 1234
