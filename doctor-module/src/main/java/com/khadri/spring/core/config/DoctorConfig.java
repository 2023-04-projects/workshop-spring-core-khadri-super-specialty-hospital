package com.khadri.spring.core.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.doctror.processor.InPatientProcessor;
import com.khadri.spring.core.doctror.processor.OutPatientProcessor;

@Configuration
@ComponentScan(value = "com.khadri.spring.core")
public class DoctorConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

	@Bean
	public InPatientProcessor inPatientProcessor() {
		return new InPatientProcessor();
	}

	@Bean
	public OutPatientProcessor outPatientProcessor() {
		return new OutPatientProcessor();
	}

}
