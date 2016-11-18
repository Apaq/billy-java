# Xena Java Bindings 

You can sign up for a Xena account at https://xena.biz.

Requirements
============

Java 1.6 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>dk.xena</groupId>
  <artifactId>xena-java</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

_Currently this requires having it build locally as it is not available in Central Repository._


Usage in Spring Boot
=====

application.yml
```yml
xena:
  serviceUrl: http://xena.biz/Api
  blobUrl: http://xena.biz/Blob
  apiKey: YOUR_API_KEY
  fiscalId: YOUR_FISCAL_ID
```

XenaExample.java

```java
import dk.xena.model.Subscription;

@SpringBootApplication
public class XenaExample {

    @AutoWired
    private XenaClient client;
    
    @PostConstruct
    private void init() {
      Page<Subscription> subscriptions = client.getSubscriptionResource().findAll();
        
      System.out.println("Count: " + subscriptions.getCount());
      for(Subscription sub : subscriptions) {
        System.out.println("Sub: " + sub);
      }
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}
```


See [Test.java](https://github.com/xenabiz/xena-java/blob/master/src/test/java/dk/xena/Test.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests:

    mvn test


Deploy Artifact
=======
Artifacts are deployed to a secure S3 repository. 
In order to be able to deploy to it, the correct credentials are required in settings.xml. 
You set it up like this:

```
<settings>
  ...
  <servers>
    ...
    <server>
      <id>aws-release</id>
      <username>[ACCESS_KEY]</username>
      <password>[SECRET_KEY]</password>
    </server>
    <server>
      <id>aws-snapshot</id>
      <username>[ACCESS_KEY]</username>
      <password>[SECRET_KEY]</password>
    </server>
    ...
  </servers>
  ...
</settings>
```


# billy-java
