package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.HistoryIndicationDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.HistoryIndication;

@Transactional
@Repository
@Scope("prototype")
public class HistoryIndicationDaoImpl extends GenericDaoImpl<HistoryIndication> implements HistoryIndicationDAO{

}
