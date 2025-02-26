package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.khadri.spring.core.doctor.Doctor;
import com.khadri.spring.core.prescription.Prescription;
import com.khadri.spring.core.process.OutPatientProcessor;
import com.khadri.spring.core.processor.InPatientProcessor;

public class DermatologyProcessor implements Doctor {

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

	public void checkup(Scanner scanner) {

		System.out.println("Dermatology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = scanner.nextInt();

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
			inPatientProcessor.process(prescription);
		} else {
			System.out.println("you will be treated as an outPatient.");
			outPatientProcessor.process(prescription);
		}

	}

}
