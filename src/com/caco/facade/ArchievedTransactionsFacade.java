package com.caco.facade;

import java.util.List;

public interface ArchievedTransactionsFacade<ArchievedTransactions> {
	
public boolean insert (ArchievedTransactions archievedTrans);
	
	public List<ArchievedTransactions> getAll();
	
	public void update( ArchievedTransactions archievedTrans);

	public void delete( ArchievedTransactions archievedTrans );

}
