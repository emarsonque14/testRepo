package com.springhibernate.service;

import com.springhibernate.entities.Login;
import com.springhibernate.entities.Users;

public interface UserService {
	void register(Users user);
	Users validateUser(Login login);
}
