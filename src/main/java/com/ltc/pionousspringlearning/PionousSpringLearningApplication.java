package com.ltc.pionousspringlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
public class PionousSpringLearningApplication {
    public static void main(String[] args) {
        SpringApplication.run(PionousSpringLearningApplication.class, args);
    }

}
