package com.khadri.spring.core.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.prescription.OutPatient;
import com.khadri.spring.core.prescription.Prescription;

@Component
public class OutPatientProcessor {
	
	@Autowired
	private OutPatient outPatient;

	// need to implement and its a template for others to call
	public void process(Prescription prescription) {
		System.out.println("Processing as an Out-Patient...");
		System.out.println("Assigning a hospital bed.");
		System.out.println("Providing necessary injections and saline.");
		System.out.println("Monitoring patient's condition.");
		System.out.println("Generating admission report.");
		System.out.println("Prescribed Medication: ");
		prescription.setPatientType(outPatient);
	}
}
