package com.khadri.spring.core.container.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.AppointConfig;
import com.khadri.spring.core.config.DoctorConfig;
import com.khadri.spring.core.container.config.ContainerConfig;

public class ContainerUtil {
		public static  AnnotationConfigApplicationContext applicationContext() {
			return new AnnotationConfigApplicationContext(ContainerConfig.class, DoctorConfig.class, AppointConfig.class);
			
		}
		
	}
	

