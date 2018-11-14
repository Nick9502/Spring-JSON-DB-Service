package com.nickthedev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nickthedev.domain.User;
import com.nickthedev.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Iterable<User> list() {
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public void save(List<User> users) {
		userRepository.saveAll(users);
	}

}
