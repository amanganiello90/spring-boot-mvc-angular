package com.amanganiello90.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amanganiello90.application.models.MessageTO;
import com.amanganiello90.application.models.entities.User;
import com.amanganiello90.application.repositories.UserRepository;
import com.amanganiello90.application.services.MessageService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MessageService messageService;


	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/message/{name}")
	public MessageTO getMessage(@PathVariable String name) {
		return messageService.getMessageFromUserName(name);
	}

}
