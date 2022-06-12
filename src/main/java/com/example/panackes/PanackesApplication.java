package com.example.panackes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class PanackesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanackesApplication.class, args);
	}

}
