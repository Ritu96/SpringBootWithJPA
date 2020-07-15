package com.example.springbootjpa.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootjpa.model.Person;

public interface PersonRepository extends CrudRepository<Person, UUID> {

	Person findById(int id);
}
