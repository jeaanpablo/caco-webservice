package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ContactDAO;
import com.caco.dao.EmployeeDAO;
import com.caco.facade.ContactFacade;
import com.caco.facade.EmployeeFacade;
import com.caco.model.Contact;
import com.caco.model.Employees;

@Transactional
@Service("EmployeeFacade")
@Scope("prototype")
public class EmployeeFacadeImpl implements EmployeeFacade<Employees>{
	
	
	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public boolean insert(Employees employee) {
		
		Employees employee2 = employeeDao.saveOrUpdate(employee);
		
		if (employee2 != null){
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
	}

	@Override
	public List<Employees> getAll() {
		
		return employeeDao.findAll();
	}

	@Override
	public void update(Employees employee) {
		
		employeeDao.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(Employees employee) {
		
		employeeDao.delete(employee);
		
	}





}
