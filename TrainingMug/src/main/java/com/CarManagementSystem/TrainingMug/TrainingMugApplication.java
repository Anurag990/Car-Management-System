package com.CarManagementSystem.TrainingMug;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Car Management System API",
				version = "1.0",
				description = "API documentation for Car Management System"
		)
)
public class TrainingMugApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingMugApplication.class, args);
	}

}
