package com.khadri.spring.core.prescription;

import org.springframework.stereotype.Component;

@Component
public class NeuroPills  {
    private String name;
    private int dosage;

    public NeuroPills() {}

    public NeuroPills(String name, int dosage) {
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
