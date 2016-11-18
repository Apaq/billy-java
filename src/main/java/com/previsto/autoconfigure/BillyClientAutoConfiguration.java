package com.previsto.autoconfigure;

import com.previsto.BillyClient;
import com.previsto.BillyClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(BillyClient.class)
@EnableConfigurationProperties(BillyProperties.class)
public class BillyClientAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(BillyClientAutoConfiguration.class);
    
    @Autowired
    private BillyProperties properties;
    
    @Autowired
    private BillyClientFactory clientFactory;
    
    @Bean
    public BillyClient xenaClient() {
        String displayKey = properties.getApiKey() != null ? "Not NULL" : "NULL";
        LOG.info("Initializing XenaClient. [apiKey={}; fiscalId={}]", displayKey, properties.getFiscalId());
        return clientFactory.create(properties.getApiKey(), properties.getFiscalId());
    }
}
