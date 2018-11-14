package com.nickthedev.repository;

import org.springframework.data.repository.CrudRepository;

import com.nickthedev.domain.User;

public interface UserRepository extends CrudRepository<User,Long>{

}
