package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Token;

@Transactional
public interface TokenDAO extends GenericDao<Token>{
	
	public Token findByUserId(Integer userId);

}
