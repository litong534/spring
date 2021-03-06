package com.pomelo.dao.impl;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.pomelo.dao.UserDAO;
import com.pomelo.entity.User;

@Component("u")
public class UserImpl implements UserDAO{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(User u) {
		Session s = sessionFactory.getCurrentSession();
		s.save(u);
	}
	
}
