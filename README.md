# spring-security-jwt

Implementation of authentication and authorization with Spring Security and JWT.

### Technologies:
- Spring Boot 3
- Spring Security 6 (JWT)
- OpenAPI 3 (Swagger)
- Spring Data JDBC
- H2 Database

### Setup

- Clone repository:
```
git clone https://github.com/mathiashahner/spring-security-jwt.git
```
- Change directory:
```
cd spring-security-jwt
```
- Build:
```
./mvnw clean package
```
- Run:
```
java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
```

### Test
- Default user credentials:
```
email: mathias@gmail.com
password: 123
```
- With the application running, access Swagger [here](http://localhost:8080/swagger-ui/index.html)