package com.khadri.spring.core.processor;

import java.util.Random;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.khadri.spring.core.bean.DoctorDetails;
import com.khadri.spring.core.doctor.Doctor;

@Component
public class AppointmentProcessor {

	private DoctorDetails doctorDetails;

	public AppointmentProcessor(DoctorDetails doctorDetails) {
		super();
		this.doctorDetails = doctorDetails;
	}

	public void processAppointment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available Doctors: ");

		for (Doctor doctor : doctorDetails.getDoctors()) {
			System.out.println("Doctor : " + doctor.getName() + ", Experience: " + doctor.getExperience() + " Years ");
		}

		System.out.println("Select a doctor (Enter number): ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		Doctor selectedDoctor = doctorDetails.getDoctors().get(choice - 1);
		System.out.println("You Selected : " + selectedDoctor.getName());

		System.out.println("Enter Patient Name:");
		String patientName = scanner.nextLine();

		System.out.println("Enter Patient Age:");
		int patientAge = scanner.nextInt();

		System.out.println("Enter Patient Phone:");
		String patientPhone = scanner.next();

		System.out.println("Token number:");
		int tokenNumber = new Random().nextInt(10000);
		System.out.println("Token Number: " + tokenNumber);

		System.out.println("\nAppointment Confirmed!");

		System.out.println("Token Number: " + tokenNumber);
		System.out.println("Patient : " + patientName + " , Age :" + patientAge + " , PhoneNumber:" + patientPhone);
		System.out.println("Doctor: " + selectedDoctor.getName());

		scanner.close();
	}
}