package com.example.shaunlavelle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = ShaunLavelleApplication.class)
public class ShaunLavelleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShaunLavelleApplication.class, args);
	}

}
