package com.voiture.voiture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.voiture.voiture.repository")
public class VoitureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureAppApplication.class, args);
	}

}
