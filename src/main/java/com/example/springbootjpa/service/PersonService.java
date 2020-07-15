package com.example.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.springbootjpa.dao.PersonDao;
import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.request.PersonRequest;

@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("personDao") PersonDao personDao) {
		this.personDao=personDao;
	}
	
	public int addPerson(PersonRequest personRequest) {
		return personDao.insertPerson(personRequest);
	}
	
	public Person getPerson(String id) {
		return personDao.getPerson(id);
	}
	
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

}
