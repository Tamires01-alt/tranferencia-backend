Executando o aplicativo Spring Boot:

## 1. Inicie o aplicativo : execute seu aplicativo Spring Boot usando seu método preferido.
## 2. Acessando o endpoint da API :
  # Abra seu navegador da web e navegue até o seguinte URL

```
http://localhost:8080/transfers
```

### Pedido de amostra :


```
{ 
    "sourceAccount": "333333", 
     "destinationAccount": "6666666", 
     "amount": 1000.00, 
      "transferDate": "2024-07-01" 
}

```

### Acessando o banco de dados: acesse o console H2: 
## 1. Para acessar o console do banco de dados na memória H2, navegue até a seguinte URL em seu navegador da web:

```
http://localhost:8080/h2-console
```

### 2. Detalhes de conexão com o banco de dados:

```
  URL:jdbc:h2:mem:mydb
  Nome de usuário:sa
  Senha:1234
  npm run lint
```
