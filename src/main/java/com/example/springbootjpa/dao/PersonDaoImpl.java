package com.example.springbootjpa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.request.PersonRequest;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
	
	private static List<Person> DB = new ArrayList<>();
	
	static {
		DB.add(new Person(UUID.randomUUID(), "Ravi"));
		DB.add(new Person(UUID.randomUUID(), "Kishan"));
		DB.add(new Person(UUID.randomUUID(), "Ritu"));
	}

	@Override
	public int insertPerson(UUID id, PersonRequest personRequest) {
		DB.add(new Person(id, personRequest.getName()));
		return 0;
	}

	@Override
	public Person getPerson(String id) {
		return DB.stream().filter(person -> person.getId().equals(UUID.fromString(id))).findFirst().get();
	}

	@Override
	public List<Person> getAllPerson() {
		return DB;
	}
	

}
