package com.khadri.spring.core.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.khadri.spring.core")
public class AppointConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

}
