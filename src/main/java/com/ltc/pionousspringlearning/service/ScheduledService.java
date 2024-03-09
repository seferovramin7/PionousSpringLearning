package com.ltc.pionousspringlearning.service;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {


    @Scheduled(fixedRate = 1000)
    void write() {
        System.out.println("Hello World ! " + LocalDateTime.now());
    }


}
