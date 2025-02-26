package com.khadri.spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

import lombok.Getter;

@Component
@Getter
public class NeuroDoctor implements Doctor {

	@Value("2")
	private int id;

	@Value("Dr.Jhon")
	private String name;

	@Value("Neuro")
	private String Speciatlist;
	
	@Value("10")
	private int experience;

}