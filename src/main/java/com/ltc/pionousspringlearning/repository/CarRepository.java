package com.ltc.pionousspringlearning.repository;

import com.ltc.pionousspringlearning.entity.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {



    ArrayList<Car> findAll();

    Car findCarByModel(String model);

    ArrayList<Car> findAllByMakeEquals(String make);

    Car deleteCarByModel(String model);


    ArrayList<Car> findAllByProductionYearBetween(int min, int max);

}
