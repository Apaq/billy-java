# Billy Java Bindings 

_This client is developed by [Apaq](https://apaq.dk)_

![Java CI with Maven](https://github.com/Apaq/billy-java/workflows/Java%20CI%20with%20Maven/badge.svg)

Requirements
============

Java 1.6 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>dk.apaq</groupId>
  <artifactId>billy-java</artifactId>
  <version> <!-- Insert latest version --> </version>
</dependency>
```

_Currently this requires having it build locally as it is not available in Central Repository._


Usage in Spring Boot
=====

application.yml
```yml
billy:
  serviceUrl: http://billy.dk/api
  apiKey: YOUR_API_KEY
```

BillyExample.java

```java
import Contact;

@SpringBootApplication
public class BillyExample {

    @AutoWired
    private BillyClient client;
    
    @PostConstruct
    private void init() {
      List<Contact> contacts = client.getContactResource().findAll();
        
      System.out.println("Count: " + contacts.size());
      for(Contact contact : contacts) {
        System.out.println("Contact: " + contact);
      }
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}
```


See [Test.java](https://github.com/Apaq/billy-java/blob/master/src/test/java/dk/apaq/billy/Test.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests:

    mvn test



