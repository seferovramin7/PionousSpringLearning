package com.ltc.pionousspringlearning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AirFilter {
    String make;
    String model;
    int productionYear;
    double price;

    @Id
    private Long id;
}
