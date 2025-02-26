package com.khadri.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.doctror.processor.DermatologyProcessor;
import com.khadri.spring.core.doctror.processor.NeurologyProcessor;
import com.khadri.spring.core.prescription.Prescription;
import com.khadri.spring.core.process.OutPatientProcessor;
import com.khadri.spring.core.processor.InPatientProcessor;

@Configuration
@ComponentScan(value = "com.khadri.spring.core")
public class DoctorConfig {

	@Bean("1")
	public DermatologyProcessor dermatologyProcessor(InPatientProcessor inPatientProcessor,
			OutPatientProcessor outPatientProcessor, Prescription prescription) {
		return new DermatologyProcessor(inPatientProcessor, outPatientProcessor, prescription);
	}

	@Bean("2")
	public NeurologyProcessor neurologyProcessor(InPatientProcessor inPatientProcessor,
			OutPatientProcessor outPatientProcessor, Prescription prescription) {
		return new NeurologyProcessor(inPatientProcessor, outPatientProcessor, prescription);
	}
}