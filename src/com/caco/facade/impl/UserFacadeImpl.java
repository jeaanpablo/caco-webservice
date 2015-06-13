package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.UserDAO;
import com.caco.facade.UserFacade;
import com.caco.model.Users;

@Transactional
@Service("userFacade")
@Scope("prototype")
public class UserFacadeImpl implements UserFacade<Users> {

	@Autowired
	private UserDAO userDao;

	@Override
	public Users insert(Users user) {
		Users users = userDao.saveOrUpdate(user);
		
		return users;
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void update(Users user) {
		userDao.saveOrUpdate(user);

	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub

	}

	@Override
	public Users findAuthority(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findByLogin(String login) {
		
		Users user = userDao.findByLogin(login);
		return user;
	}

	@Override
	public Users findByEmail(String email) {
		
		return userDao.findByEmail(email);
	}

	@Override
	public boolean validatePassword(String password, Users user) {
		boolean validatePassword;
				
		if(user.getPassword().equalsIgnoreCase(password))
		{
			validatePassword = true;
		}else{
			validatePassword = false;
		}
		
		return validatePassword;
	}

	@Override
	public boolean validateLogin(String login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateEmail(String email, Users user) {
		
		boolean validator = false;
		
		if(email.equalsIgnoreCase(user.getEmail()))
		{
			validator = true;
		}
		
		return validator;
	}
	
	
	
	

}
