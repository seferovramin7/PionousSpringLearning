package com.ltc.pionousspringlearning.controller;


import static org.mockito.Mockito.when;

import com.ltc.pionousspringlearning.service.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarControllerTest {

    @InjectMocks
    CarController carController;

    @Mock
    CarService carServiceTest;


    @Test
    public void calcTest() {
        when(carServiceTest.calc(5, 5)).thenReturn(10);
        int calc = carController.calc(5, 5);
        Assertions.assertEquals(10, calc);
        System.out.println("Hello Test !");
    }

}
