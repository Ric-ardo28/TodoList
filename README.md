# To-Do List

Este é um projeto de lista de tarefas ("To-Do List") desenvolvido em **Spring Boot** com **Java 21**. O objetivo do sistema é gerenciar tarefas, permitindo operações de cadastro, consulta, atualização e exclusão.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.5**
  - Spring Web
  - Spring Data JPA
  - Spring WebFlux
  - Spring Boot DevTools
  - Spring Validation
- **Lombok** (para eliminar boilerplate)
- **Banco de Dados**
  - H2 (ambiente de desenvolvimento)
  - MySQL (ambiente de produção)
- **Documentação com SpringDoc e OpenAPI**
- **Testes**
  - Spring Boot Starter Test
  - Spring REST Docs
  - Reactor Test

## Requisitos

- **Java 21** ou superior.
- **Maven** para gerenciar o build.
- **MySQL** (opcional: caso vá rodar em produção).

## Configuração

### Banco de Dados

Por padrão, o projeto está configurado para utilizar o banco de dados **H2** em memória no ambiente de desenvolvimento. Para utilizá-lo, nenhuma configuração adicional é necessária.

Se deseja utilizar **MySQL** no ambiente de produção, configure as credenciais no `application.properties` ou `application.yml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Documentação da API

A documentação da API está disponível via **Swagger UI** no endpoint padrão:
```
http://localhost:8080/swagger-ui.html
```
### Executando o Projeto

1. Clone o repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd todolist
   ```

2. Compile o projeto:

   ```bash
   mvn clean install
   ```

3. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação no navegador:

   ```
   http://localhost:8080
   ```

### Testes

Para rodar os testes unitários e de integração, execute:

```bash
mvn test
```

## Estrutura do Projeto

O projeto segue a estrutura padrão do Spring Boot:
```
src/
 ├── main/
 │    ├── java/
 │    │    └── br.com.ricardo.todolist/
 │    │         ├── controller/    # Endpoints REST
 │    │         ├── model/         # Entidades JPA
 │    │         ├── repository/    # Repositórios JPA
 │    │         └── service/       # Lógica de negócio
 │    └── resources/
 │         ├── application.properties   # Configurações da aplicação
 │         └── static/                  # Arquivos estáticos (HTML, JS, CSS, etc.)
 └── test/
      └── java/
           └── br.com.ricardo.todolist/  # Testes
```
## Próximos Passos

- Implementar autenticação/autorização com **Spring Security**.
- Adicionar cache para melhorar o desempenho.
- Introduzir testes de carga e performance.

## Contribuições

Pull requests são bem-vindos. Para mudanças maiores, abra primeiro uma issue para discutir o que você gostaria de alterar.

