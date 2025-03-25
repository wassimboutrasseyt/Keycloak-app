package com.example.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(new Product(null, "Dell XPS 13", 1000.0));
			productRepository.save(new Product(null, "HP Pavilion", 650.0));
			productRepository.save(new Product(null, "Lenovo ThinkPad", 800.0));
			productRepository.findAll().forEach(System.out::println);
		};
	}

}
