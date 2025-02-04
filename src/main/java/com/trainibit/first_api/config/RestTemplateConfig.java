package com.trainibit.first_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
<<<<<<< HEAD
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
=======
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
>>>>>>> c572bc0 (primera api)
