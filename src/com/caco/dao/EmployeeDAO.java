package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Contact;
import com.caco.model.Employees;

@Transactional
public interface EmployeeDAO extends GenericDao<Employees>{

}
