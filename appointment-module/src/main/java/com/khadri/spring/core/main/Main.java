package com.khadri.spring.core.main;

import org.springframework.context.ApplicationContext;

import com.khadri.spring.core.container.util.ContainerUtil;
import com.khadri.spring.core.doctor.Doctor;
import com.khadri.spring.core.doctor.SpecialistDoctor;
import com.khadri.spring.core.processor.AppointmentProcessor;

public class Main {

	public static ApplicationContext applicationContext;

	public static void main(String[] args) {
 
		applicationContext = ContainerUtil.applicationContext();

		AppointmentProcessor processor = applicationContext.getBean(AppointmentProcessor.class);
		Doctor appointedDoctor = processor.processAppointment();

		applicationContext.getBean(String.valueOf(appointedDoctor.getId()), SpecialistDoctor.class).checkup();

	}
}
