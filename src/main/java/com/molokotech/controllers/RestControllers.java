package com.molokotech.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.molokotech.model.Person;
import com.molokotech.repository.PersonRespository;;

@RestController
public class RestControllers {

	@Autowired
	PersonRespository personRepository;
	
	@GetMapping("/create-user")
	public String hello(String name, String lastname) {
		Person p = new Person();
		p.setName(name);
		p.setLastname(lastname);
		personRepository.save(p);
		return "The data inserted is " + name + " and " + lastname;
	}
	
}
