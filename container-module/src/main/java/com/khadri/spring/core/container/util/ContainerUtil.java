package com.khadri.spring.core.container.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.DoctorConfig;
import com.khadri.spring.core.config.InPatientConfig;
import com.khadri.spring.core.config.OutPatientConfig;
import com.khadri.spring.core.config.PrescriptionConfig;
import com.khadri.spring.core.container.config.ContainerConfig;

public class ContainerUtil {
	public static AnnotationConfigApplicationContext applicationContext() {
		return new AnnotationConfigApplicationContext(ContainerConfig.class, DoctorConfig.class, InPatientConfig.class,
				OutPatientConfig.class, PrescriptionConfig.class);
	}
}
