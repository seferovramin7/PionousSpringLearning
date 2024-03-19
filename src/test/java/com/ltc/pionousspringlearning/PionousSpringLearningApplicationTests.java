package com.ltc.pionousspringlearning;

import com.ltc.pionousspringlearning.controller.CarController;
import com.ltc.pionousspringlearning.service.CarServiceTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PionousSpringLearningApplicationTests {

    @InjectMocks
    CarController controller;

    @Mock
    CarServiceTest service;

    @Test
    void contextLoads() {
        System.out.println("Hello Test !!");
    }


}
