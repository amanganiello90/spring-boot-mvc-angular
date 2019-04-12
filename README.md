## Spring boot mvc angular

> This is a basic app with CRUD operations on H2 database. It can use an angular client or a thymeleaf engine with MVC pattern.
So there are a **UserController** and a **UserRestController** to expose api and model.

## News

- RestController **/api**: GET and POST **/users**
- RestController **/api**: GET **/message/{name}** with MessageTO and Service business logic
- Added Swagger ui in **/swagger-ui.html**
- Tested Angular client with env constant for apiUrl

## NEXT DEVELOPMENTS (checked in progress)

- [ ] JUnit Test RestController and check angular client with CORS
- [ ] Add switching maven profile to include and activate dependency with controller for MVC thymeleaf.
- [ ] Check better h2 configuration in application.properties.

### Relevant Articles: 
- [Spring Boot CRUD Application with Thymeleaf](https://www.baeldung.com/spring-boot-crud-thymeleaf)
- [Building a Web Application with Spring Boot and Angular](https://www.baeldung.com/spring-boot-angular-web)
- [Setting Up Swagger 2 with a Spring REST API](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)

