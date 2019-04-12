package com.amanganiello90.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amanganiello90.application.entities.User;
import com.amanganiello90.application.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}

}
