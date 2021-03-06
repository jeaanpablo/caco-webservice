package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.EmployeeDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Employees;

@Transactional
@Repository
@Scope("prototype")
public class EmployeeDaoImpl extends GenericDaoImpl<Employees> implements EmployeeDAO{

}
