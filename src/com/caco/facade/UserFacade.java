package com.caco.facade;

import java.util.List;

public interface UserFacade<Users> {
	
	public com.caco.model.Users insert (Users user);
	
	public List<Users> getAll();
	
	public void update( Users user );

	public void delete( Users user );
	
	public Users findAuthority( Integer id );
	
	public com.caco.model.Users findByLogin(String login);
	 
	public com.caco.model.Users findByEmail(String email);
	
	public boolean validatePassword(String password, Users user);
	
	public boolean validateLogin(String login);
	
	public boolean validateEmail(String email, Users user);


}
