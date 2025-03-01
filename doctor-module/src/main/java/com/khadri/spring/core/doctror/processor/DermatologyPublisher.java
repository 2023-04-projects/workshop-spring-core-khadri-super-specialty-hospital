package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.context.ApplicationEventPublisher;

import com.khadri.spring.core.doctor.SpecialistDoctor;
import com.khadri.spring.core.event.InPrescriptionEvent;
import com.khadri.spring.core.event.OutPrescriptionEvent;
import com.khadri.spring.core.prescription.PatientType;

public class DermatologyPublisher implements SpecialistDoctor {

	private ApplicationEventPublisher applicationEventPublisher;

	public DermatologyPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void checkup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dermatology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = 2;

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
			InPrescriptionEvent event = new InPrescriptionEvent(this);
			event.setPatientType(PatientType.INPATIENT);
			applicationEventPublisher.publishEvent(event);
		} else {
			System.out.println("you will be treated as an outPatient.");
			OutPrescriptionEvent event = new OutPrescriptionEvent(this);
			event.setPatientType(PatientType.OUTPATIENT);
			applicationEventPublisher.publishEvent(event);
		}

		scanner.close();
	}

}
