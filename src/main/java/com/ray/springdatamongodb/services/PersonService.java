package com.ray.springdatamongodb.services;

import com.ray.springdatamongodb.models.Person;
import com.ray.springdatamongodb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(@Autowired PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<? extends Person> getPersonByFirstName(String firstName){
        return Optional.of(personRepository.findByFirstName(firstName));
    }

    public Optional<? extends Person> getPersonByLastName(String lastName){
        return Optional.of(personRepository.findByLastName(lastName));
    }

    public long deletePersonByFirstName(String firstName){
        return personRepository.deleteByFirstName(firstName);
    }

    public long deletePersonByLastName(String lastName){
        return personRepository.deleteByLastName(lastName);
    }

}
