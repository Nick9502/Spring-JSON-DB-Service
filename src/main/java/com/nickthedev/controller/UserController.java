package com.nickthedev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nickthedev.domain.User;
import com.nickthedev.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/list")
	public Iterable<User> list() {
		return userService.list();
	}
	

}
