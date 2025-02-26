package com.khadri.spring.core.bean;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

@Component
public class DermatologyDoctor implements Doctor {

	private String name = "1.Dr.Allen (Dermotology)";
	private int experience = 15;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getExperience() {
		return experience;
	}

}
