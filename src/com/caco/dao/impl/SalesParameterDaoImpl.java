package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.SalesParameterDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.SalesParameter;

@Transactional
@Repository
@Scope("prototype")
public class SalesParameterDaoImpl extends GenericDaoImpl<SalesParameter> implements SalesParameterDAO{

}
