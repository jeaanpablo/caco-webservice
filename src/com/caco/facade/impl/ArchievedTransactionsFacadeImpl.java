package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.ArchievedTransactionsFacade;
import com.caco.model.ArchievedTransactions;

@Transactional
@Service("archievedTFacade")
@Scope("prototype")
public class ArchievedTransactionsFacadeImpl implements ArchievedTransactionsFacade<ArchievedTransactions>{

	@Override
	public boolean insert(ArchievedTransactions archievedTrans) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ArchievedTransactions> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ArchievedTransactions archievedTrans) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ArchievedTransactions archievedTrans) {
		// TODO Auto-generated method stub
		
	}

}
