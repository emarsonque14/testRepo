package com.springhibernate.dao;
import com.springhibernate.entities.Login;
import com.springhibernate.entities.Users;
public interface UserDao {
  void register(Users user);
  Users validateUser(Login login);
}