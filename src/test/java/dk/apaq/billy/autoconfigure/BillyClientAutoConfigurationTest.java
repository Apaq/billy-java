package dk.apaq.billy.autoconfigure;

import dk.apaq.billy.BillyClient;
import org.junit.After;
import org.junit.Test;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static org.junit.Assert.*;

public class BillyClientAutoConfigurationTest {

    private AnnotationConfigApplicationContext context;

    @After
    public void tearDown() {
        if (this.context != null) {
            this.context.close();
        }
    }

    @Test
    public void defaultNativeConnectionFactory() {
        load(EmptyConfiguration.class, 
                "billy.serviceUrl=https://api.billysbilling.com/v2", 
                "billy.apiKey=qwerty123");
        BillyClient client = this.context.getBean(BillyClient.class);
        assertEquals("qwerty123", client.getApiKey());
    }

    @Configuration
    static class EmptyConfiguration {
    }

    private void load(Class<?> config, String... environment) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        TestPropertyValues.of(environment).applyTo(applicationContext);
        applicationContext.register(config);
        applicationContext.register(BillyClientAutoConfiguration.class, BillyClientFactoryAutoConfiguration.class);
        applicationContext.refresh();
        this.context = applicationContext;
    }

}
