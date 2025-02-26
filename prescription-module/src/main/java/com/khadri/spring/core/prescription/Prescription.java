package com.khadri.spring.core.prescription;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Prescription {

	private List<DermoPills> dermoPills = new ArrayList<>();

	private List<NeuroPills> neuroPills = new ArrayList<>();

	private List<Injection> injections = new ArrayList<>();

	private List<Saline> salines = new ArrayList<>();
	
	private PatientType patientType;

	@PostConstruct
	public void init() {
		dermoPills.add(new DermoPills("Clobazam", 50));
		dermoPills.add(new DermoPills("Fluocinonide", 30));

		neuroPills.add(new NeuroPills("Gabapentin", 100));
		neuroPills.add(new NeuroPills("Pregabalin", 75));

		injections.add(new Injection("Insulin", 10));
		injections.add(new Injection("Vitamin B12", 5));

		salines.add(new Saline("Normal Saline", 500));
		salines.add(new Saline("Ringer Lactate", 1000));
	}

	public void showPrescriptionDetails() {
		System.out.println("Prescription Details:");

		System.out.println("DermoPills:");
		for (DermoPills pill : dermoPills) {
			System.out.println("- Name: " + pill.getName() + ", Dosage: " + pill.getDosage() + "mg");
		}

		System.out.println("NeuroPills:");
		for (NeuroPills pill : neuroPills) {
			System.out.println("- Name: " + pill.getName() + ", Dosage: " + pill.getDosage() + "mg");
		}

		System.out.println("Injections:");
		for (Injection injection : injections) {
			System.out.println("- Name: " + injection.getName() + ", Dosage: " + injection.getDosage() + "ml");
		}

		System.out.println("Salines:");
		for (Saline saline : salines) {
			System.out.println("- Type: " + saline.getType() + ", Volume: " + saline.getVolume() + "ml");
		}
	}
	
	public PatientType getPatientType() {
		return patientType;
	}
	
	public void setPatientType(PatientType patientType) {
		this.patientType = patientType;
	}
}
