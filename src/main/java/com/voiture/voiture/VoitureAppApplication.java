package com.voiture.voiture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.voiture.voiture.repository")
public class VoitureAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(VoitureAppApplication.class, args);
	}

}
