package com.example.SwaggerInSpringBoot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Employee CRUD API",
                version = "1.0",
                description = "A beginner-friendly CRUD API built with Spring Boot and Swagger"
        )
)
@SpringBootApplication
public class SwaggerInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerInSpringBootApplication.class, args);
	}

}
