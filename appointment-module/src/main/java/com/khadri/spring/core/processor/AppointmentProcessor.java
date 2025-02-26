package com.khadri.spring.core.processor;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.bean.DoctorDetails;
import com.khadri.spring.core.doctor.Doctor;

@Component
public class AppointmentProcessor {

	private DoctorDetails doctorDetails;

	private Scanner scanner;

	public AppointmentProcessor(DoctorDetails doctorDetails) {
		super();
		this.doctorDetails = doctorDetails;

	}

	public Doctor processAppointment() {
		System.out.println("Available Doctors: ");

		for (Doctor doctor : doctorDetails.getDoctors()) {
			System.out.println("Doctor : id: " + doctor.getId() + ", Name:  " + doctor.getName() + ", Specialist :  "
					+ doctor.getSpeciatlist() + ", Experience: " + doctor.getExperience() + " Years ");
		}

		System.out.println("Select a doctor (Enter number): ");
		scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.nextLine();

		Optional<Doctor> selectedDoctorOptional = doctorDetails.getDoctors().stream()
				.filter(eachDoctor -> eachDoctor.getId() == choice).findFirst();

		selectedDoctorOptional.ifPresent(selectedDoctor -> {

			System.out.println("You Selected : " + selectedDoctor.getName());

			System.out.println("Enter Patient Name:");
			String patientName = scanner.nextLine();

			System.out.println("Enter Patient Age:");
			int patientAge = scanner.nextInt();

			System.out.println("Enter Patient Phone:");
			String patientPhone = scanner.next();

			int tokenNumber = new Random().nextInt(10000);
			System.out.println("Token Number: " + tokenNumber);

			System.out.println("\nAppointment Confirmed!");

			System.out.println("Token Number: " + tokenNumber);
			System.out.println("Patient : " + patientName + " , Age :" + patientAge + " , PhoneNumber:" + patientPhone);
			System.out.println("Doctor Name : " + selectedDoctor.getName());
			System.out.println("Specilization in : " + selectedDoctor.getSpeciatlist());
		});

		scanner.close();
		return selectedDoctorOptional.get();
	}
}