package com.cts.training.sample.dao;

import java.util.List;

import com.cts.training.sample.model.User;

public interface UserDao 
{
	 public boolean saveUser(User user);
	 
	 public boolean UpdateUser(User user);
	
	public boolean deleteUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();
	

}
