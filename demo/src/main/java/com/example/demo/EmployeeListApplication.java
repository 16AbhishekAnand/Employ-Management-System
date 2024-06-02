package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan( {"Controller","Service","Model","Repository"})
@SpringBootApplication
public class EmployeeListApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeListApplication.class, args);
	}

}
