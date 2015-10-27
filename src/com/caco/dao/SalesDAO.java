package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Sales;

@Transactional
public interface SalesDAO extends GenericDao<Sales>{

}
