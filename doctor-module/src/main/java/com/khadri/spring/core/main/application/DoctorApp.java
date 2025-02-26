package com.khadri.spring.core.main.application;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.DoctorConfig;
import com.khadri.spring.core.doctror.processor.DermatologyProcessor;
import com.khadri.spring.core.doctror.processor.InPatientProcessor;
import com.khadri.spring.core.doctror.processor.NeurologyProcessor;
import com.khadri.spring.core.doctror.processor.OutPatientProcessor;

public class DoctorApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DoctorConfig.class);

		Scanner scanner = context.getBean(Scanner.class);

		System.out.println("Select doctor type: 1: Dermatology, 2: Neurology");
		int choice = scanner.nextInt();

		if (choice == 1) {
			DermatologyProcessor dermatologyProcessor = context.getBean("dermoProcessor", DermatologyProcessor.class);
			InPatientProcessor inPatientProcessor = context.getBean(InPatientProcessor.class);
			OutPatientProcessor outPatientProcessor = context.getBean(OutPatientProcessor.class);
			dermatologyProcessor.checkup(scanner);
			inPatientProcessor.process(inPatientProcessor);
			outPatientProcessor.process(outPatientProcessor);
		} else if (choice == 2) {
			NeurologyProcessor neurologyProcessor = context.getBean("neuroprocessor", NeurologyProcessor.class);
			InPatientProcessor inPatientProcessor = context.getBean(InPatientProcessor.class);
			OutPatientProcessor outPatientProcessor = context.getBean(OutPatientProcessor.class);
			neurologyProcessor.checkup(scanner);
			inPatientProcessor.process(inPatientProcessor);
			outPatientProcessor.process(outPatientProcessor);
		} else {
			System.out.println("Invalid choice. Exiting.");
		}

		scanner.close();
		((AnnotationConfigApplicationContext) context).close();
	}

}
