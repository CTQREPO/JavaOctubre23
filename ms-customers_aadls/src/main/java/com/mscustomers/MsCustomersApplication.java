package com.mscustomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.mspersistence.repository")
@EntityScan("com.mspersistence.entity") //sobreescribe la confi de jpa
public class MsCustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomersApplication.class, args);
	}

}
