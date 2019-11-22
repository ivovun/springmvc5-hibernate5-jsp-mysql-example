package net.javaguides.springmvc.dao;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface UserDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(User theUser);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
