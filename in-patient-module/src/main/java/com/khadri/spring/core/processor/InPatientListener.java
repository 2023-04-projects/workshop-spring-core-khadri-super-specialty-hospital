package com.khadri.spring.core.processor;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.InPrescriptionEvent;
import com.khadri.spring.core.prescription.PatientType;

@Component
public class InPatientListener implements ApplicationListener<InPrescriptionEvent> {

	@Override
	public void onApplicationEvent(InPrescriptionEvent event) {
		if (event.getPatientType() != PatientType.INPATIENT) {
			System.out.println("Error: This processor is for In-Patients only.");
			return;
		}

		System.out.println("Processing as an In-Patient...");
		System.out.println("Assigning a hospital bed.");
		System.out.println("Providing necessary injections and saline.");
		System.out.println("Monitoring patient's condition.");
		System.out.println("Generating admission report.");
		event.showPrescriptionDetails();
		
	}

	 
}
