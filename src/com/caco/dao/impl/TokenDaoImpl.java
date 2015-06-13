package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.TokenDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Token;
import com.caco.model.Users;

@Transactional
@Repository
@Scope("prototype")
public class TokenDaoImpl extends GenericDaoImpl<Token> implements TokenDAO{

	@Override
	public Token findByUserId(Integer userId) {
		
		String query = " SELECT " + 
				 "		t " + 
				 " FROM " + 
				 "		Token t " +
				 " WHERE " + 
				 "		t.user.idUser = :idUser ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("idUser", userId);
		
		List<Token> tokens = findByNamedParams(query, parameters);
		
		Token token;
		
		if(tokens.size() == 1)
		{
			token = tokens.get(0);
		}
		else
		{
			token = null;
		}
		
		return token;
	}

}
