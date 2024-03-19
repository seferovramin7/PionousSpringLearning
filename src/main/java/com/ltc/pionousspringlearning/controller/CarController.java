package com.ltc.pionousspringlearning.controller;

import com.ltc.pionousspringlearning.dto.CarDto;
import com.ltc.pionousspringlearning.service.CarService;
import com.ltc.pionousspringlearning.service.EmailService;
import java.io.IOException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("car")
public class CarController {


    private final CarService carService;

    private final EmailService emailService;


    @GetMapping("calc")
    public int calc(@RequestParam int a, int b) {
        return carService.calc(a, b);
    }


    @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> uploadExcelFile(@RequestParam("partnersExcel") MultipartFile file)
            throws IOException {
        return null;
    }


    @GetMapping("all")
    public List<CarDto> getCars() {
        return carService.getCars();
    }


    @GetMapping("by-year")
    public List<CarDto> getCarsByYear(@RequestParam int minYear, @RequestParam int maxYear) {
        return carService.getCarsByYear(minYear, maxYear);
    }


    @PostMapping("add")
    public CarDto createCar(@RequestBody CarDto newCar) {
        return carService.createCar(newCar);
    }


    @DeleteMapping("delete/{model}")
    public ResponseEntity<CarDto> deleteCar(@PathVariable String model) {
        return carService.deleteCar(model);
    }


    @PutMapping
    public CarDto update(@RequestParam String model, @RequestBody CarDto updatedCar) {
        return carService.update(model, updatedCar);
    }


}
