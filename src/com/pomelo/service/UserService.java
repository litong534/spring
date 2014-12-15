package com.pomelo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pomelo.dao.LogDAO;
import com.pomelo.dao.UserDAO;
import com.pomelo.entity.Log;
import com.pomelo.entity.User;

@Component("userService")
public class UserService {
	private UserDAO userDAO;
	private LogDAO logDAO;
	
	public LogDAO getLogDAO() {
		return logDAO;
	}
	@Resource(name="logDAO")
	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}

	public void init(){
		System.out.println("class init");
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	@Resource(name="u")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Transactional
	public void addUser(User u){
		this.userDAO.save(u);
		Log log = new Log();
		log.setMsg("a user saved!");
		this.logDAO.save(log);
	}
	
	public void destroy(){
		System.out.println("class destroy");
	}
}
