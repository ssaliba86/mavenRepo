package com.example.demo.repo;


import com.example.demo.emp.Emp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<Emp,Integer> {

}
