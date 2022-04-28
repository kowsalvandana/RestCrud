package com.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repository.UserRepo;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public Integer saveUser(User userId) {
	
		return repo.save(userId).getUserId();
	}

	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public void deleteUser(Integer userId) {
	try {
		repo.deleteById(userId);
	}
	catch(DataAccessException ex){
	      throw new RuntimeException(ex.getMessage());
	    }
		
	}

	
	@Override
	public Optional<User> getOneUser(Integer userId) {
	
		return repo.findById(userId);
	}

	@Override
	public void updateUser(User user) {
		repo.save(user);
		
	}

}
