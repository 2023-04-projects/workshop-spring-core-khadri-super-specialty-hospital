package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.khadri.spring.core.doctor.SpecialistDoctor;
import com.khadri.spring.core.prescription.PatientType;
import com.khadri.spring.core.prescription.Prescription;
import com.khadri.spring.core.processor.InPatientProcessor;
import com.khadri.spring.core.processor.OutPatientProcessor;

public class DermatologyProcessor implements SpecialistDoctor {

	private InPatientProcessor inPatientProcessor;

	private OutPatientProcessor outPatientProcessor;

	private Prescription prescription;

	@Autowired
	public DermatologyProcessor(InPatientProcessor inPatientProcessor, OutPatientProcessor outPatientProcessor,
			Prescription prescription) {
		this.inPatientProcessor = inPatientProcessor;
		this.outPatientProcessor = outPatientProcessor;
		this.prescription = prescription;

	}

	public void checkup() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dermatology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = 9;

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
	        prescription.setPatientType(PatientType.INPATIENT); 
			inPatientProcessor.process(prescription);
		} else {
			System.out.println("you will be treated as an outPatient.");
			 prescription.setPatientType(PatientType.OUTPATIENT);
			outPatientProcessor.process(prescription);
		}

		scanner.close();
	}

}
