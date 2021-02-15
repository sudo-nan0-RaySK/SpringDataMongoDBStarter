package com.ray.springdatamongodb;

import com.ray.springdatamongodb.models.Person;
import com.ray.springdatamongodb.models.Vehicle;
import com.ray.springdatamongodb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		personRepository.deleteAll();

		personRepository.insert(new Person("Ray","Kan",
				new Vehicle("Alto 800","budget")));
		personRepository.insert(new Person("Mariah","Wong",
				new Vehicle("Honda City","Sedan")));
		personRepository.insert(new Person("Tyson","Jordan",
				new Vehicle("Renault Duster","SUV")));

		System.out.println(personRepository.findByLastName("Wong"));
	}
}
