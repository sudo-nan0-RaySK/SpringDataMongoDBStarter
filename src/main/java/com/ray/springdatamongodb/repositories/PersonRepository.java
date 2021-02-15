package com.ray.springdatamongodb.repositories;

import com.ray.springdatamongodb.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository
        extends MongoRepository<Person,String>,
        CustomPersonRepository
{

    List<Person> findAll();

    Person findByFirstName(String firstName);

    Person findByLastName(String lastName);

    long deleteByFirstName(String firstName);

    long deleteByLastName(String lastName);
}
