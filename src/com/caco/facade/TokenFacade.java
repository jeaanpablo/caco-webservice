package com.caco.facade;

import java.util.List;

public interface TokenFacade <Token> {

		public com.caco.model.Token insert (Token token);
		
		public List<Token> getAll();
		
		public void update( Token token);

		public void delete( Token token );
		
		public com.caco.model.Token findByUserId( Integer userId );
		
		public String generateToken (Integer idUser);

}
