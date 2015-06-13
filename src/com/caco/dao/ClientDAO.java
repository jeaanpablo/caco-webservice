package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Clients;

@Transactional
public interface ClientDAO extends GenericDao<Clients>{

}
