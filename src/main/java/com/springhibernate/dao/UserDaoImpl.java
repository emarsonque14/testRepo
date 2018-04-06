package com.springhibernate.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.entities.Login;
import com.springhibernate.entities.Users;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
//  @Autowired
//  DataSource datasource;
//  
//  @Autowired
//  JdbcTemplate jdbcTemplate;
  
  @Autowired
  SessionFactory session;
  
  public void register(Users users) {
	  session.getCurrentSession().saveOrUpdate(users);
    }
    public Users validateUser(Login login) {
		String sql = "from Users U where U.username=:username and U.password=:password";
		Query query = session.getCurrentSession().createQuery(sql);
        query.setParameter("username", login.getUsername());
        query.setParameter("password", login.getPassword());
	    List<Users> users = query.list();
	    return users.size() > 0 ? users.get(0) : null;
    }
  }
