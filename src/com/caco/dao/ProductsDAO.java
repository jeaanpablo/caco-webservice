package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Products;

@Transactional
public interface ProductsDAO extends GenericDao<Products>{

}
