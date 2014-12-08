package com.pomelo.dao.impl;

import com.pomelo.dao.UserDAO;
import com.pomelo.entity.User;

public class UserImpl implements UserDAO{

	public void save(User u) {
		System.out.println("user saved!");
	}
	
}
