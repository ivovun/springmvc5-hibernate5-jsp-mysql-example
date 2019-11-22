package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId);

	public void deleteUser(int theId);
	
}
