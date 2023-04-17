package com.pharos.dbconnector;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Juan Torres",
						email = "juan.torres.devt@gmail.com",
						url = "Pending"
				),
				license = @License(
						name = "Apache 2.0",
						url = "Pending"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "Pending"
		)
)
@SpringBootApplication
public class DbConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectorApplication.class, args);
	}

}
