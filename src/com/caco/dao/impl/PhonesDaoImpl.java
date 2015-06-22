package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.PhonesDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Phones;


@Transactional
@Repository
@Scope("prototype")
public class PhonesDaoImpl  extends GenericDaoImpl<Phones> implements PhonesDAO{

}
