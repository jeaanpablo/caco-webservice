package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.SalesParameter;

@Transactional
public interface SalesParameterDAO extends GenericDao<SalesParameter>{

}
