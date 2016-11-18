package com.previsto.autoconfigure;

import com.previsto.autoconfigure.BillyClientFactoryAutoConfiguration;
import com.previsto.autoconfigure.BillyClientAutoConfiguration;
import com.previsto.BillyClient;
import com.previsto.BillyClientFactory;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static org.junit.Assert.*;
import org.springframework.boot.test.EnvironmentTestUtils;

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
                "xena.serviceUrl=http://test.xena.biz/Api", 
                "xena.blobUrl=http://test.xena.biz/Blob",
                "xena.apiKey=qwerty123", 
                "xena.fiscalId=12345");
        BillyClient client = this.context.getBean(BillyClient.class);
        assertEquals("qwerty123", client.getApiKey());
        assertEquals(12345L, client.getFiscalId());
    }

    @Configuration
    static class EmptyConfiguration {
    }

    private void load(Class<?> config, String... environment) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        EnvironmentTestUtils.addEnvironment(applicationContext, environment);
        applicationContext.register(config);
        applicationContext.register(BillyClientAutoConfiguration.class, BillyClientFactoryAutoConfiguration.class);
        applicationContext.refresh();
        this.context = applicationContext;
    }

}
