package com.khadri.spring.core.container.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.AppointConfig;
import com.khadri.spring.core.config.DoctorConfig;
import com.khadri.spring.core.config.InPatientConfig;
import com.khadri.spring.core.config.OutPatientConfig;
import com.khadri.spring.core.config.PrescriptionConfig;

public class ContainerUtil {

	public static AnnotationConfigApplicationContext applicationContext() {
		return new AnnotationConfigApplicationContext(DoctorConfig.class, InPatientConfig.class, OutPatientConfig.class,
				PrescriptionConfig.class, AppointConfig.class);
	}
}