package com.khadri.spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

import lombok.Getter;

@Component
@Getter
public class DermatologyDoctor implements Doctor {

	@Value("1")
	private int id;

	@Value("Dr.Allen")
	private String name;

	@Value("Determotologist")
	private String Speciatlist;

	@Value(value = "10")
	private int experience;

}
