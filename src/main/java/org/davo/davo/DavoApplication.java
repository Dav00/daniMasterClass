package org.davo.davo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DavoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavoApplication.class, args);
	}

}
