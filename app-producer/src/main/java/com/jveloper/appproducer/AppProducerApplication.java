package com.jveloper.appproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class AppProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProducerApplication.class, args);

    }

    @Bean
    public Supplier<Patient> producer(){
        return () -> new Patient(UUID.randomUUID(), "Mikael");
    }


}
