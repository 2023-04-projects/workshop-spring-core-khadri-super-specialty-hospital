package com.khadri.spring.core.processor;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.OutPrescriptionEvent;
import com.khadri.spring.core.prescription.PatientType;

@Component
public class OutPatientListener implements ApplicationListener<OutPrescriptionEvent> {

	@Override
	public void onApplicationEvent(OutPrescriptionEvent event) {

		if (event.getPatientType() != PatientType.OUTPATIENT) {
			System.out.println("Error: This processor is for out-Patients only.");
			return;
		}
		System.out.println("Processing as an Out-Patient...");
		System.out.println("Scheduling doctor consultation.");
		System.out.println("Providing prescribed medication.");
		System.out.println("No hospital admission required.");
		event.showPrescriptionDetails();
	}
}
