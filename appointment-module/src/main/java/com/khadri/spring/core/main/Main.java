package com.khadri.spring.core.main;

import org.springframework.context.ApplicationContext;

import com.khadri.spring.core.container.util.ContainerUtil;
import com.khadri.spring.core.doctor.Doctor;
import com.khadri.spring.core.doctor.SpecialistDoctor;
import com.khadri.spring.core.prescription.PatientType;
import com.khadri.spring.core.prescription.Prescription;
import com.khadri.spring.core.processor.AppointmentProcessor;
import com.khadri.spring.core.processor.InPatientProcessor;
import com.khadri.spring.core.processor.OutPatientProcessor;

public class Main {

	public static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = ContainerUtil.applicationContext();

		 AppointmentProcessor processor =
		 applicationContext.getBean(AppointmentProcessor.class);
		 Doctor appointedDoctor = processor.processAppointment();

		 applicationContext.getBean(String.valueOf(appointedDoctor.getId()),
		 SpecialistDoctor.class).checkup();
		Prescription prescription = applicationContext.getBean(Prescription.class);

		prescription.setPatientType(PatientType.INPATIENT);

		if (prescription.getPatientType() == PatientType.INPATIENT) {
			InPatientProcessor inPatientProcessor = applicationContext.getBean(InPatientProcessor.class);
			inPatientProcessor.process(prescription);
		} else {
			OutPatientProcessor outPatientProcessor = applicationContext.getBean(OutPatientProcessor.class);
			outPatientProcessor.process(prescription);
		}
	}
}
