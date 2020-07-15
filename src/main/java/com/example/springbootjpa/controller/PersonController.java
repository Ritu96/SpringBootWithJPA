package com.example.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.springbootjpa.model.Person;
import com.example.springbootjpa.service.PersonService;

@Controller
public class PersonController { 
	
	private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService=personService;
	}
	
	@PostMapping("/person")
	public void addPerson(Person person) {
		personService.addPerson(person);
	}
	
	@GetMapping("/person/{id}")
	@ResponseBody
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@GetMapping("/person/all")
	@ResponseBody
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}

}
