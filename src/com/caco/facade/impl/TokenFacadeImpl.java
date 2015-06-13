package com.caco.facade.impl;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.TokenDAO;
import com.caco.facade.TokenFacade;
import com.caco.model.Token;

@Transactional
@Service("tokenFacade")
@Scope("prototype")
public class TokenFacadeImpl implements TokenFacade<Token>{

	@Autowired
	TokenDAO tokenDao;
	
	@Override
	public Token insert(Token token) {
		Token tokenInserted = tokenDao.saveOrUpdate(token);
		return tokenInserted;
	}

	@Override
	public List<Token> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Token token) {
		tokenDao.saveOrUpdate(token);
	}

	@Override
	public void delete(Token token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String generateToken(Integer idUser) {
		
		Calendar cal = Calendar.getInstance();
		
		String token = UUID.randomUUID().toString().toUpperCase() 
	            + "|" +idUser+ "|"
	            + cal.getTimeInMillis();
		
		return token;
	}

	@Override
	public Token findByUserId(Integer userId) {
		
		Token token =  tokenDao.findByUserId(userId);
		
		return token;
	}

}
