package com.contact.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={
		"com.contact.controller", "com.contact.dto","com.contact.service","com.contact.test"})
@ComponentScan("com.contact.test")
@SpringBootConfiguration
@EnableJpaRepositories(basePackages = {""})
@EntityScan("com.contact.persistance")   
public class NewContactAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewContactAppApplication.class, args);
	}

}
