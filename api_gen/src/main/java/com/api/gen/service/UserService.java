package com.api.gen.service;

import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.gen.common.Message;
import com.api.gen.entity.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value="/user")
	public ResponseEntity<Message> insertUser(UserRepository user) {
		
		Message message = new Message();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		message.set
		
		return ResponseEntity
		
		
		
	}

}
