# API de Registro de Usuário com Consulta de CEP (Arquitetura Limpa)

## Funcionalidades Principais

### 1. Registro de Usuário

- **Rota:** `POST /api/user`
- **Descrição:** Permite o registro de novos usuários na aplicação.
- **Parâmetros de Entrada:**

```json

{
    "id":1,
    "name":"User Name",
    "username":"user",
    "password":"1123456",
    "adress": {
        "cep":"12345678"
    }
}
```
- **Comportamento:**
  - Antes de salvar o usuário no banco de dados, a API consulta um serviço de terceiros para obter informações detalhadas de endereço com base no CEP fornecido.
  - O endereço completo (logradouro, cidade, estado, etc.) é então associado ao usuário antes de ser persistido no banco de dados.

## Configurações

Acesse o arquivo de configuração `application.properties` para configurar as informações relacionadas ao banco de dados.

```properties
# Configurações do Banco de Dados
spring.h2.console.enabled=true
# default path: h2-console
spring.h2.console.path=/h2-console
 
spring.datasource.url=jdbc:h2:file:./testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop
