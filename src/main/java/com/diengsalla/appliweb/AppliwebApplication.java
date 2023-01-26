package com.diengsalla.appliweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.diengsalla.appliweb.repository.EmployeeProxy;

import lombok.Data;

@Data
@SpringBootApplication
@ComponentScan
public class AppliwebApplication{

	@Autowired
	private EmployeeProxy prox;
	public static void main(String[] args) {
		SpringApplication.run(AppliwebApplication.class, args);
	}
	

}
