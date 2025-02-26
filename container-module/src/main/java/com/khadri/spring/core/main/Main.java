package com.khadri.spring.core.main;

import org.springframework.context.ApplicationContext;

import com.khadri.spring.core.container.util.ContainerUtil;
import com.khadri.spring.core.processor.AppointmentProcessor;


public class Main {
	
	
	public static ApplicationContext applicationContext;

	public static void main(String[] args) {
		
		 applicationContext = ContainerUtil.applicationContext();

		AppointmentProcessor processor = applicationContext.getBean(AppointmentProcessor.class);

		processor.processAppointment();
		
	}

}
