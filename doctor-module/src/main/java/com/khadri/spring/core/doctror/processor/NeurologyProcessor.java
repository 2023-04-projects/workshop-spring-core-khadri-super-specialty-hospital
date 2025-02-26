package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

@Component("neuroprocessor")
public class NeurologyProcessor implements Doctor {

	private InPatientProcessor inPatientProcessor;
	private OutPatientProcessor outPatientProcessor;

	@Autowired
	public NeurologyProcessor(InPatientProcessor inPatientProcessor, OutPatientProcessor outPatientProcessor) {
		this.inPatientProcessor = inPatientProcessor;
		this.outPatientProcessor = outPatientProcessor;
	}

	public void checkup(Scanner scanner) {

		System.out.println("Neurology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = scanner.nextInt();

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
			inPatientProcessor.process(inPatientProcessor);
		} else
			System.out.println("you will be treated as an outPatient.");
		outPatientProcessor.process(outPatientProcessor);

	}
}
