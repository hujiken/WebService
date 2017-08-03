package com.huy.pham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huy.pham.repository.UserRepository;
import com.huy.pham.service.response.UserInfoResponse;

@RestController
public class UserController {
	private UserRepository repository;

	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	
	
}
