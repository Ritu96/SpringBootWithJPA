package com.example.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.request.PersonRequest;
import com.example.springbootjpa.service.PersonService;

@RestController
public class PersonController { 
	
	private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService=personService;
	}
	
	@PostMapping("/person")
	public void addPerson(@RequestBody PersonRequest personRequest) {
		personService.addPerson(personRequest);
	}
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@GetMapping("/person/all")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}

}
