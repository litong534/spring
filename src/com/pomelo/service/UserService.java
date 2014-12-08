package com.pomelo.service;

import com.pomelo.dao.UserDAO;
import com.pomelo.dao.impl.UserImpl;
import com.pomelo.entity.User;

public class UserService {
	private UserDAO userDAO = new UserImpl();
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(User u){
		this.userDAO.save(u);
	}
}
