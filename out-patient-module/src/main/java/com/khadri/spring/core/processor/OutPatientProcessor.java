package com.khadri.spring.core.processor;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.prescription.PatientType;
import com.khadri.spring.core.prescription.Prescription;

@Component
public class OutPatientProcessor {

	public void process(Prescription prescription) {
		if (prescription.getPatientType() != PatientType.OUTPATIENT) {
			System.out.println("Error: This processor is for out-Patients only.");
			return;
		}
		System.out.println("Processing as an Out-Patient...");
		System.out.println("Scheduling doctor consultation.");
		System.out.println("Providing prescribed medication.");
		System.out.println("No hospital admission required.");
		prescription.showPrescriptionDetails();

	}
}
