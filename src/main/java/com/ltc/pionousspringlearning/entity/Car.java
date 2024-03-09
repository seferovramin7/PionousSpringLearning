package com.ltc.pionousspringlearning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String make;
    String model;
    int productionYear;
    double price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
