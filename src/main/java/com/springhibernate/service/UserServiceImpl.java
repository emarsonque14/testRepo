package com.springhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.dao.UserDao;
import com.springhibernate.entities.Login;
import com.springhibernate.entities.Users;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	 UserDao userDao;
	public void register(Users user) {
		userDao.register(user);

	}

	public Users validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
