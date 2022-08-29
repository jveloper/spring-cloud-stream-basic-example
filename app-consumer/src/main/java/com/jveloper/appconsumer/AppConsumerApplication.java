package com.jveloper.appconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class AppConsumerApplication {

    Logger logger = LoggerFactory.getLogger(AppConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AppConsumerApplication.class, args);
    }

    @Bean
    public Consumer<Patient> consumer(){
        return patient -> logger.info("Receive patient with {}", patient.getId());
    }

}
