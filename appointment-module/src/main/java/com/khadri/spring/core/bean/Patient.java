package com.khadri.spring.core.bean;

public class Patient {
	private String name;
	private int age;
	private String contact;

	public Patient(String name, int age, String contact) {
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
