package com.epam.currencytimer.repository;

import com.epam.currencytimer.entity.Dollar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DollarRepository extends MongoRepository<Dollar, Integer> {

}