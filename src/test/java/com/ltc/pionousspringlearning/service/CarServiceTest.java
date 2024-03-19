package com.ltc.pionousspringlearning.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @InjectMocks
    CarService carService;

    @Test
    public void testCalcService() {


        int actual = carService.calc(4, 3);


        Assertions.assertEquals(7, actual);
    }

}
