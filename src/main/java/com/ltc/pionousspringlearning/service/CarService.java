package com.ltc.pionousspringlearning.service;


import com.ltc.pionousspringlearning.config.feign.CopartApiClient;
import com.ltc.pionousspringlearning.config.feign.RocketClient;
import com.ltc.pionousspringlearning.dto.CarDto;
import com.ltc.pionousspringlearning.dto.CopartCarDto;
import com.ltc.pionousspringlearning.dto.Launch;
import com.ltc.pionousspringlearning.entity.Car;
import com.ltc.pionousspringlearning.repository.CarRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {

    private final ModelMapper modelMapper;


    private final CarRepository carRepository;


    private final ScheduledService scheduledService;


    private final RocketClient rocketClient;

    private final CopartApiClient copartApiClient;

    public ArrayList<CopartCarDto> getCopartCars() {
        return copartApiClient.getCars();
    }


    public ArrayList<Launch> getLaunches() {
        return rocketClient.getLaunches();
    }


    public ResponseEntity<CarDto> deleteCar(String model) {
        Car car = carRepository.deleteCarByModel(model);

        return ResponseEntity.ok(convertToDto(car));
    }


    public Car getById(Long id) {
        log.info("getById method called with {} and hello {}", id, 13);
        return carRepository.findById(id).orElse(null);
    }

    public List<CarDto> getCars() {
        ArrayList<Car> cars = carRepository.findAll();
        return cars.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }


    public List<CarDto> getCarsByYear(@RequestParam int minYear, @RequestParam int maxYear) {

        ArrayList<Car> cars =
                carRepository.findAllByProductionYearBetween(minYear, maxYear);

        return cars.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }


    public CarDto createCar(@RequestBody CarDto newCar) {
        Car savedCar = carRepository.save(convertToDao(newCar));
        return convertToDto(savedCar);
    }


    public CarDto update(@RequestParam String model, @RequestBody CarDto updatedCar) {


        System.out.println(model);
        Car carByModel = carRepository.findCarByModel(model);
        carByModel.setPrice(updatedCar.getPrice());
        Car save = carRepository.save(carByModel);
        return convertToDto(save);

    }


    public CarDto convertToDto(Car car) {
        return modelMapper.map(car, CarDto.class);
    }

    public Car convertToDao(CarDto carDto) {
        return modelMapper.map(carDto, Car.class);
    }


}
