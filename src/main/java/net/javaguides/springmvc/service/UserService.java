package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.User;

public interface UserService {

	public List<User> getCustomers();

	public void saveCustomer(User theUser);

	public User getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
