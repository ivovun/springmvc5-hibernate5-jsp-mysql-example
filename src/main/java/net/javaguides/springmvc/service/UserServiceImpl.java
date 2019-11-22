package net.javaguides.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springmvc.dao.UserDAO;
import net.javaguides.springmvc.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getCustomers() {
		return userDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(User theUser) {
		userDAO.saveCustomer(theUser);
	}

	@Override
	@Transactional
	public User getCustomer(int theId) {
		return userDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		userDAO.deleteCustomer(theId);
	}
}





