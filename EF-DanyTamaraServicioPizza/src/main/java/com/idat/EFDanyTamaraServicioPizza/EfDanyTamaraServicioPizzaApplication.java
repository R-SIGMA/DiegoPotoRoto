package com.idat.EFDanyTamaraServicioPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfDanyTamaraServicioPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDanyTamaraServicioPizzaApplication.class, args);
	}

}
