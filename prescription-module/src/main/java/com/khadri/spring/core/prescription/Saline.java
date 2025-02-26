package com.khadri.spring.core.prescription;

import org.springframework.stereotype.Component;

@Component
public class Saline {
	private String type;
	private int volume;

	public Saline() {}

	public Saline(String type, int volume) {
		this.type = type;
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public int getVolume() {
		return volume;
	}
}
