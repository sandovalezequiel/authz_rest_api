# authz_rest_api

## application.properties example
```
server.port=9091
spring.application.name=AuthzAPI

authz.host=127.0.0.1
authz.username=admin
authz.password=password

spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:bootapp;DB_CLOSE_DELAY=-1
spring.datasource.username=sa
spring.datasource.password=
```