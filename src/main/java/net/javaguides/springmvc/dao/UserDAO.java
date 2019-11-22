package net.javaguides.springmvc.dao;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface UserDAO {

	public List<Customer> getCustomers();

	public void saveUser(User theUser);

	public Customer getCustomer(int theId);

	public void deleteUser(int theId);
	
}
