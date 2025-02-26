package com.khadri.spring.core.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import com.khadri.spring.core.doctor.Doctor;

@Component
public class DoctorDetails {
	private List<Doctor> doctors;

	public DoctorDetails(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

}
