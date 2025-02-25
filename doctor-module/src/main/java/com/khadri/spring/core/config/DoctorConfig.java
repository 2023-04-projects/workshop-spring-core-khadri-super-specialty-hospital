package com.khadri.spring.core.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.doctror.processor.DermatologyProcessor;
import com.khadri.spring.core.doctror.processor.NeurologyProcessor;

@Configuration
@ComponentScan(value = "com.khadri.spring.core")
public class DoctorConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

	@Bean
	public DermatologyProcessor dermatologyprocessor() {
		return new DermatologyProcessor();
	}

	@Bean
	public NeurologyProcessor neurologyprocessor() {
		return new NeurologyProcessor();
	}

}
