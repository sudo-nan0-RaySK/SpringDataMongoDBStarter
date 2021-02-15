package com.ray.springdatamongodb.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@ToString
@Getter
@Setter
public class Person {

    @Id
    private String id;
    private final String firstName;
    private final String lastName;
    private final Vehicle vehicleDetails;

    public Person(String firstName, String lastName, Vehicle vehicleDetails){
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicleDetails = vehicleDetails;
    }
}
