package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import com.khadri.spring.core.doctor.SpecialistDoctor;
import com.khadri.spring.core.event.InPrescriptionEvent;
import com.khadri.spring.core.event.OutPrescriptionEvent;
import com.khadri.spring.core.prescription.PatientType;

public class NeurologyPublisher implements SpecialistDoctor {

	private ApplicationEventPublisher eventPublisher;

	@Autowired
	public NeurologyPublisher(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	public void checkup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Neurology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = scanner.nextInt();

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
			InPrescriptionEvent event = new InPrescriptionEvent(this);
			event.setPatientType(PatientType.INPATIENT);
			eventPublisher.publishEvent(event);
		} else {
			System.out.println("you will be treated as an outPatient.");
			OutPrescriptionEvent event = new OutPrescriptionEvent(this);
			event.setPatientType(PatientType.OUTPATIENT);
			eventPublisher.publishEvent(event);
		}
		scanner.close();

	}
}
