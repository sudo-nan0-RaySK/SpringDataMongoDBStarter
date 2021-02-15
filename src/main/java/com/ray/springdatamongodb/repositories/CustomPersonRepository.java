package com.ray.springdatamongodb.repositories;

import com.ray.springdatamongodb.models.Person;

import java.util.List;

public interface CustomPersonRepository {

    List<Person> findByVehicleType(String carType);

}
