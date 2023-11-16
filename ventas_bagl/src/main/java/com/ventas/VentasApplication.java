package com.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.persistence.repository")

//Sobreescribir la configuracion de JPA
@EntityScan("com.persistence.entity")
public class VentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentasApplication.class, args);
	}

}
