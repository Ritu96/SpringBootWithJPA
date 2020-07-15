package com.example.springbootjpa.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.repository.PersonRepository;
import com.example.springbootjpa.request.PersonRequest;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
	
	private PersonRepository personRepository;

	@Autowired
	PersonDaoImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public int insertPerson(UUID id, PersonRequest personRequest) {
		Person person = new Person();
		person.setId(id);
		person.setName(personRequest.getName());
		
		personRepository.save(person);
		
		return 0;
	}

	@Override
	public Person getPerson(String id) {
		return personRepository.findById(UUID.fromString(id)).get();
	}

	@Override
	public List<Person> getAllPerson() {
		return (List<Person>) personRepository.findAll();
	}
	

}
