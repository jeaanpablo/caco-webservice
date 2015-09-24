package com.caco.facade;

import java.util.List;

public interface HistoryIndicationFacade<HistoryIndication> {
	
public boolean insert (HistoryIndication historyIndication);
	
	public List<HistoryIndication> getAll();
	
	public void update( HistoryIndication historyIndication);

	public void delete( HistoryIndication historyIndication );

}
