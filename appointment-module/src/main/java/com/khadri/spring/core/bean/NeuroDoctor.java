package com.khadri.spring.core.bean;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

@Component
public class NeuroDoctor implements Doctor {

	private String name = "2.Dr.JHON(Neuro)";
	private int experience = 10;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getExperience() {
		return experience;
	}

}
