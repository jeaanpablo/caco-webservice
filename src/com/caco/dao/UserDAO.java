package com.caco.dao;


import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Users;

@Transactional
public interface UserDAO extends GenericDao<Users> {
	
	public Users findByLogin(String login);
	
	public Users findByEmail(String email);


}
