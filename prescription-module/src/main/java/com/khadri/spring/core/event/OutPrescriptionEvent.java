package com.khadri.spring.core.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEvent;

import com.khadri.spring.core.prescription.DermoPills;
import com.khadri.spring.core.prescription.Injection;
import com.khadri.spring.core.prescription.NeuroPills;
import com.khadri.spring.core.prescription.PatientType;
import com.khadri.spring.core.prescription.Saline;

public class OutPrescriptionEvent extends ApplicationEvent {

	public OutPrescriptionEvent(Object source) {
		super(source);
	}

	private List<DermoPills> dermoPills = new ArrayList<>();
	private List<NeuroPills> neuroPills = new ArrayList<>();
	private List<Injection> injections = new ArrayList<>();
	private List<Saline> salines = new ArrayList<>();
	private PatientType patientType;

	{
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
		System.out.println("Patient Type: " + patientType);
		System.out.println("Prescription Details:");

		if (patientType == PatientType.OUTPATIENT) {
			System.out.print("Dermo Pills: ");
			printPills(dermoPills);
			System.out.print("Neuro Pills: ");
			printPills(neuroPills);
		} else if (patientType == PatientType.INPATIENT) {
			System.out.print("Injections: ");
			printInjections(injections);
			System.out.print("Salines: ");
			printSalines(salines);
		}
	}

	private void printPills(List<? extends Object> pills) {
		for (int i = 0; i < pills.size(); i++) {
			if (pills.get(i) instanceof DermoPills) {
				DermoPills pill = (DermoPills) pills.get(i);
				System.out.print(pill.getName());
			} else if (pills.get(i) instanceof NeuroPills) {
				NeuroPills pill = (NeuroPills) pills.get(i);
				System.out.print(pill.getName());
			}
			if (i < pills.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	private void printInjections(List<Injection> injections) {
		for (int i = 0; i < injections.size(); i++) {
			System.out.print(injections.get(i).getName());
			if (i < injections.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	private void printSalines(List<Saline> salines) {
		for (int i = 0; i < salines.size(); i++) {
			System.out.print(salines.get(i).getType());
			if (i < salines.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public PatientType getPatientType() {
		return patientType;
	}

	public void setPatientType(PatientType patientType) {
		this.patientType = patientType;
	}

}
