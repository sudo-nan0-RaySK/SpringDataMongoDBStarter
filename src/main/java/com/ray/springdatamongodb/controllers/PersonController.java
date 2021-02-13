package com.ray.springdatamongodb.controllers;

import com.ray.springdatamongodb.models.Person;
import com.ray.springdatamongodb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(@Autowired PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll(){
        return personService.findAll();
    }

    @DeleteMapping("/{firstName}")
    public long deleteByFirstName(@PathVariable("firstName") String firstName){
        return personService.deletePersonByFirstName(firstName);
    }

}
