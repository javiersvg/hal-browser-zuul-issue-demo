package com.example.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by javier on 04/02/17.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer getByName(String name);
}
