package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.LoyalityCardFacade;
import com.caco.model.LoyalityCard;


@Transactional
@Service("permissionFacade")
@Scope("prototype")
public class LoyalityCardFacadeImpl implements LoyalityCardFacade<LoyalityCard>{

	@Override
	public boolean insert(LoyalityCard loyalityCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<LoyalityCard> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(LoyalityCard loyalityCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(LoyalityCard loyalityCard) {
		// TODO Auto-generated method stub
		
	}

}
