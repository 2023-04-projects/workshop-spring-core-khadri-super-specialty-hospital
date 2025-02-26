package com.khadri.spring.core.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.prescription.DermoPills;
import com.khadri.spring.core.prescription.Injection;
import com.khadri.spring.core.prescription.NeuroPills;
import com.khadri.spring.core.prescription.Saline;

@Configuration
@ComponentScan(value="com.khadri.spring.core")
public class PrescriptionConfig {

    @Bean
    public List<DermoPills> dermoPills() {
        return List.of(new DermoPills("Clobazam", 50), new DermoPills("Fluocinonide", 30));
    }

    @Bean
    public List<NeuroPills> neuroPills() {
        return List.of(new NeuroPills("Gabapentin", 100), new NeuroPills("Pregabalin", 75));
    }

    @Bean
    public List<Injection> injections() {
        return List.of(new Injection("Insulin", 10), new Injection("Vitamin B12", 5));
    }

    @Bean
    public List<Saline> salines() {
        return List.of(new Saline("Normal Saline", 500), new Saline("Ringer Lactate", 1000));
    }
}
