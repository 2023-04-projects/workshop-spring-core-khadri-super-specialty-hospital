package com.khadri.spring.core.main.application;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.DoctorConfig;
import com.khadri.spring.core.doctror.processor.DermatologyProcessor;
import com.khadri.spring.core.doctror.processor.NeurologyProcessor;

public class DoctorApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DoctorConfig.class);

		Scanner scanner = context.getBean(Scanner.class);

		System.out.println("Select doctor type: 1: Dermatology, 2: Neurology");
		int choice = scanner.nextInt();

		if (choice == 1) {
			DermatologyProcessor dermatologyProcessor = context.getBean("dermoProcessor", DermatologyProcessor.class);
			dermatologyProcessor.checkup(scanner);
		} else if (choice == 2) {
			NeurologyProcessor neurologyProcessor = context.getBean("neuroprocessor", NeurologyProcessor.class);
			neurologyProcessor.checkup(scanner);
		} else {
			System.out.println("Invalid choice. Exiting.");
		}

		scanner.close();
		((AnnotationConfigApplicationContext) context).close();
	}

}
