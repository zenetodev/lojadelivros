# Loja de Livros - Spring Data JPA

Este projeto é uma API para gerenciamento de uma loja de livros, desenvolvida com Spring Boot, Spring Data JPA e PostgreSQL.

## Funcionalidades

- Cadastro de livros, autores, editoras e avaliações.
- Associação de autores e editoras aos livros.
- CRUD completo para livros.
- Persistência com JPA e PostgreSQL.

## Estrutura do Projeto

```
src/
  main/
    java/com/lojadelivros/jpa/
      controller/      # Controllers REST
      dto/             # DTOs para transferência de dados
      model/           # Entidades JPA
      repository/      # Repositórios Spring Data
      services/        # Serviços de negócio
    resources/
      application.properties # Configurações do banco e JPA
  test/
    java/com/lojadelivros/jpa/ # Testes automatizados
```

## Requisitos

- Java 17+
- Maven 3.9+
- PostgreSQL
- Postman (Para realizar os testes)

## Configuração

Edite o arquivo [`src/main/resources/application.properties`](src/main/resources/application.properties) com os dados do seu banco PostgreSQL:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/lojadelivros
spring.datasource.username=postgres
spring.datasource.password=admin
```

## Como executar

1. Instale as dependências:
   ```sh
   ./mvnw clean install
   ```
2. Execute a aplicação:
   ```sh
   ./mvnw spring-boot:run
   ```
3. Acesse a API em [http://localhost:8081/bookstore/books](http://localhost:8081/bookstore/books)

## Testes

Execute os testes automatizados com:
```sh
./mvnw test
```

## Endpoints principais

- `GET /bookstore/books` - Lista todos os livros
- `POST /bookstore/books` - Cadastra um novo livro
- `DELETE /bookstore/books/{id}` - Remove um livro

## Aprendizado

Este projeto foi desenvolvido como parte de um curso de **Spring Data JPA**, com o objetivo de praticar conceitos de persistência, relacionamento entre entidades e construção de APIs REST utilizando o ecossistema Spring.

## Licença

Projeto desenvolvido para fins de estudo com Spring Boot e JPA.

---

Feito por Zé Neto
