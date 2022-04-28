package com.user.service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import com.user.model.User;

public interface UserService {
	public Integer saveUser(User userId);
	public List<User> getAllUsers();
	public void deleteUser(Integer userId);
	public void updateUser(User user);
	public Optional<User> getOneUser(Integer userId);

}
