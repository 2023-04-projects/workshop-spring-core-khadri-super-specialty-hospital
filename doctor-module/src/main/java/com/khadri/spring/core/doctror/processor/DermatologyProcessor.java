package com.khadri.spring.core.doctror.processor;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

@Component("dermoProcessor")
public class DermatologyProcessor implements Doctor {

	public void checkup(Scanner scanner) {

		System.out.println("Dermatology Checkup Started...");
		System.out.println("How long have you been suffering? (in days):");
		int days = scanner.nextInt();

		if (days > 10) {
			System.out.println("Patient has been suffering for a long time. Advanced treatment required.");
		} else
			System.out.println("you will be treated as an outPatient.");

	}

}
