package com.example.springbootjpa.dao;

import java.util.List;
import java.util.UUID;

import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.request.PersonRequest;

public interface PersonDao {
	
	int insertPerson(UUID id, PersonRequest personRequest);
	
	default int insertPerson(PersonRequest personRequest) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, personRequest);	
	}

	Person getPerson(String id);
	
	List<Person> getAllPerson();
}
