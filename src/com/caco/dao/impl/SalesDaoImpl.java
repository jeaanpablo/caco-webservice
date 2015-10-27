package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.SalesDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Sales;

@Transactional
@Repository
@Scope("prototype")
public class SalesDaoImpl extends GenericDaoImpl<Sales> implements SalesDAO{

}
