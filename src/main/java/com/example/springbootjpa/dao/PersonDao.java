package com.example.springbootjpa.dao;

import java.util.List;
import java.util.UUID;

import com.example.springbootjpa.model.Person;

public interface PersonDao {
	
	int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);	
	}

	Person getPerson(String id);
	
	List<Person> getAllPerson();
}
