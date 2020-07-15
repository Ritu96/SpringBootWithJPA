package com.example.springbootjpa.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	
	@Id
	private UUID id;
	private String name;
	

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
