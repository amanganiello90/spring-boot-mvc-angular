package com.amanganiello90.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanganiello90.application.models.MessageTO;
import com.amanganiello90.application.models.entities.User;
import com.amanganiello90.application.repositories.UserRepository;

@Service
public class MessageService {
	
	@Autowired
	UserRepository userRepository;
	
	public MessageTO getMessageFromUserName(String name) {
		List<User> users=userRepository.findByName(name);
		String message=users.isEmpty()? ("Not found user with name:"+ name):("I'm the first user:"+users.get(0).toString());
		return new MessageTO("1",message);
		
	}

}
