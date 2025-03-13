package com.springbasic.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdApplication.class, args);
	   System.out.println("your application is running");
		
	}

}
