package br.com.mariohood.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mariohood.api.domain.User;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		User user = new User(1, "Mario", "mario@email.com", "1234"); 
	}

}
