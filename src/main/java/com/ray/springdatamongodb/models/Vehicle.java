package com.ray.springdatamongodb.models;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Document("Vehicle")
public class Vehicle {
    private final String modelName;
    private final String vehicleType;

    public Vehicle(String modelName, String vehicleType) {
        this.modelName = modelName;
        this.vehicleType = vehicleType ;
    }
}
