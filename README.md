# Spring Plugin Core

### Implement Strategy Pattern with Spring Plugin

### Requeriments:
- Java 11+
- Maven 3+
- HTTPie or web client tool of your choice :)

### Run application:
```shell
mvn spring-boot:run
```

### Example Requests:
- `Directory with examples ./httpRequests/`
- `A log will be issued when the plugin finds the implementation by the notification type informed in the request`
#### SMS
```shell
http --json POST :8090/api/v1/notifications < httpRequests/postNotificationsSMS.json

{
    "status": "SMS sent successfully"
}
```

#### EMAIL
```shell
http --json POST :8090/api/v1/notifications < httpRequests/postNotificationsEMAIL.json

{
    "status": "EMAIL sent successfully"
}
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

