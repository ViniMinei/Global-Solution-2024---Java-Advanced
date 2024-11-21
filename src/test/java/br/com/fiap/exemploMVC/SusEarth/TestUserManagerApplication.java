package br.com.fiap.exemploMVC.SusEarth;

import org.springframework.boot.SpringApplication;

public class TestUserManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(SusEarthApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
