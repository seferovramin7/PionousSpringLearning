package com.ltc.pionousspringlearning.dto;

import com.ltc.pionousspringlearning.entity.AirFilter;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Builder
public class CarDto {
    String make;
    String model;
    int productionYear;
    double price;
}
