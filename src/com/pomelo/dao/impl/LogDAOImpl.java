package com.pomelo.dao.impl;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.pomelo.dao.LogDAO;
import com.pomelo.dao.UserDAO;
import com.pomelo.entity.Log;
import com.pomelo.entity.User;

@Component("logDAO")
public class LogDAOImpl implements LogDAO{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(Log log) {
		Session s = sessionFactory.getCurrentSession();
		s.save(log);
	}
	
}
