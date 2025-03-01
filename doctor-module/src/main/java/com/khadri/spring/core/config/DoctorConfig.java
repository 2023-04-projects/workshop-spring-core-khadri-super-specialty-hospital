package com.khadri.spring.core.config;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.doctror.processor.DermatologyPublisher;
import com.khadri.spring.core.doctror.processor.NeurologyPublisher;

@Configuration
@ComponentScan(value = "com.khadri.spring.core")
public class DoctorConfig {

	@Bean("1")
	public DermatologyPublisher dermatologyProcessor(ApplicationEventPublisher applicationEventPublisher) {
		return new DermatologyPublisher(applicationEventPublisher);
	}

	@Bean("2")
	public NeurologyPublisher neurologyProcessor(ApplicationEventPublisher applicationEventPublisher) {
		return new NeurologyPublisher(applicationEventPublisher);
	}
}