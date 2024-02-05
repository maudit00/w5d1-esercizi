package it.epicode.demo;

import it.epicode.demo.beans.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

	Menu menu = new Menu();

}
