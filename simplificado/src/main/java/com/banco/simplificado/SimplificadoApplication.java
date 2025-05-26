package com.banco.simplificado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SimplificadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplificadoApplication.class, args);
	}

}
