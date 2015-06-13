package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.UserDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Users;

@Transactional
@Repository
@Scope("prototype")
public class UserDaoImpl extends GenericDaoImpl<Users> implements UserDAO {

	@Override
	public Users findByLogin(String login) {
		String query = " SELECT " + 
				 "		u " + 
				 " FROM " + 
				 "		Users u " +
				 " WHERE " + 
				 "		u.login = :login ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("login", login);
		
		List<Users> users = findByNamedParams(query, parameters);
		
		Users user;
		
		if(users.size() == 1)
		{
			user = users.get(0);
		}
		else
		{
			user = null;
		}
		
		return user; 
	}

	@Override
	public Users findByEmail(String email) {
		

		String query = " SELECT " + 
				 "		u " + 
				 " FROM " + 
				 "		Users u " +
				 " WHERE " + 
				 "		u.email = :email ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("email", email);
		
		List<Users> users = findByNamedParams(query, parameters);
		
		Users user;
		
		if(users.size() == 1)
		{
			user = users.get(0);
		}
		else
		{
			user = null;
		}
		
		return user; 	
	}

}
