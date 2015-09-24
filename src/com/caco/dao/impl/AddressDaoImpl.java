package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.AddressDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Address;

@Transactional
@Repository
@Scope("prototype")
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDAO{

}
