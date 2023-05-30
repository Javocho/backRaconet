package com.example.raconet;

import com.example.raconet.professor.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class RaconetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaconetApplication.class, args);
	}

}
