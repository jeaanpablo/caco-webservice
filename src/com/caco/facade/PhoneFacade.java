package com.caco.facade;

import java.util.List;
import com.caco.model.Phones;

public interface PhoneFacade<Phones> {
	
	public Phones insert (Phones phone);
	
	public List<Phones> getAll();
	
	public void update(Phones phone);

	public void delete(Phones phone);
}
