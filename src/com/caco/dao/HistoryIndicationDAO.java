package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.HistoryIndication;
@Transactional
public interface HistoryIndicationDAO extends GenericDao<HistoryIndication>{

}
