package com.voiture.voiture.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.voiture.voiture.service.ImgBBService;

import org.springframework.beans.factory.annotation.Value;


@Configuration
public class ImgBBConfig {

    @Value("${imgbb.api-key}")
    private String imgBBApiKey;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ImgBBService imgBBService() {
        return new ImgBBService(imgBBApiKey, restTemplate());
    }
}
