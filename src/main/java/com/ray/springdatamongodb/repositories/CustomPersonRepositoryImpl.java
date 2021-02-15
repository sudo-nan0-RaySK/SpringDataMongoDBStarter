package com.ray.springdatamongodb.repositories;

import com.ray.springdatamongodb.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

@Repository
public class CustomPersonRepositoryImpl implements CustomPersonRepository{

    private final MongoTemplate mongoTemplate;

    public CustomPersonRepositoryImpl(@Autowired MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Person> findByVehicleType(String vehicleType) {
        return mongoTemplate.query(Person.class)
                .matching(query(
                        where("vehicleDetails.vehicleType").is(vehicleType)
                )).all();
    }
}
