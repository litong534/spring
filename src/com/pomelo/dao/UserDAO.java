package com.pomelo.dao;

import org.springframework.stereotype.Component;

import com.pomelo.entity.User;
@Component
public interface UserDAO {
	public void save(User u);
}