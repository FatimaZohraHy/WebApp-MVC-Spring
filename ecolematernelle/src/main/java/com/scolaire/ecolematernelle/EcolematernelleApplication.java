package com.scolaire.ecolematernelle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.scolaire.ecolematernelle.Entity")
@EnableJpaRepositories("com.scolaire.ecolematernelle.Repository")
@ComponentScan("com.scolaire.ecolematernelle.Service")
@ComponentScan("com.scolaire.ecolematernelle.Controller")
public class EcolematernelleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcolematernelleApplication.class, args);
	}

}
