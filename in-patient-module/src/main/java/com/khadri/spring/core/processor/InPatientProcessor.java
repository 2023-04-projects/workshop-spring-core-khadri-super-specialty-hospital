package com.khadri.spring.core.processor;


import org.springframework.stereotype.Component;

import com.khadri.spring.core.prescription.Prescription;

@Component
public class InPatientProcessor {
    
	//need to implement and its a template for others to call
    public void process(Prescription prescription) {
        System.out.println("Processing as an In-Patient...");
        System.out.println("Assigning a hospital bed.");
        System.out.println("Providing necessary injections and saline.");
        System.out.println("Monitoring patient's condition.");
        System.out.println("Generating admission report.");
        System.out.println("Prescribed Medication: " );
    }
}
