package com.example.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WelcomerProperties.class)
public class WelcomerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Welcomer welcomer(WelcomerProperties welcomerProperties) {
        return new Welcomer(welcomerProperties);
    }
}

