package com.khadri.spring.core.processor;

import org.springframework.stereotype.Component;
import com.khadri.spring.core.prescription.Prescription;
import com.khadri.spring.core.prescription.PatientType;

@Component
public class InPatientProcessor {

    public void process(Prescription prescription) {
        if (prescription.getPatientType() != PatientType.INPATIENT) {
            System.out.println("Error: This processor is for In-Patients only.");
            return;
        }

        System.out.println("Processing as an In-Patient...");
        System.out.println("Assigning a hospital bed.");
        System.out.println("Providing necessary injections and saline.");
        System.out.println("Monitoring patient's condition.");
        System.out.println("Generating admission report.");
        prescription.showPrescriptionDetails();
    }
}
