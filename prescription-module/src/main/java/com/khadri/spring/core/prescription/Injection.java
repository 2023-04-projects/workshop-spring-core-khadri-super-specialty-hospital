package com.khadri.spring.core.prescription;

public class Injection {
	private String name;
	private int dosage;

	public Injection() {}

	public Injection(String name, int dosage) {
		this.name = name;
		this.dosage = dosage;
	}

	public String getName() {
		return name;
	}

	public int getDosage() {
		return dosage;
	}
}
