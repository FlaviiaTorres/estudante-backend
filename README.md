<h1 align="center">
Cadastro de Alunos
</h1>

API para cadastrar novos estudantes de um curso EAD

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data + MySql](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)

## Como Executar

### Localmente
- Clonar repositório git
- Construir o projeto:

./mvnw clean package

- Executar:

java -jar student-backend/target/student-backend-0.0.1-SNAPSHOT.jar


A API poderá ser acessada em [localhost:8080](http://localhost:8080).



## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [postman](([https://www.postman.com/])):

- POST /student

http POST :8080/student/add name="" address="" telephone="" email="" cpf=""

HTTP/1.1 200 OK
Content-Length: 129
Content-Type: application/json

{
     name=""
     address=""
     telephone=""
     email=""
     cpf=""
}

![image](https://github.com/FlaviiaTorres/estudante-backend/assets/106637834/be76d7bc-1eb6-475e-bc8c-023655666bb1)


- GET /student/getAll

http :8080/student/getAll
HTTP/1.1 200 OK
Content-Length: 129
Content-Type: application/json

{
     name=""
     address=""
     telephone=""
     email=""
     cpf=""
} 
![image](https://github.com/FlaviiaTorres/estudante-backend/assets/106637834/d37e4d1e-1c01-4625-993f-8975cfa4492d)


