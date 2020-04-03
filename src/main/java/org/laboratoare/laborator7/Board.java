package org.laboratoare.laborator7;
import java.util.ArrayList;
import java.util.List;



public class Board {
	
	int number=10;
	List<Token> tokensList = new ArrayList<>();
	
	public Board() {
		
	}
	
	public Board ( int number, List<Token> tokensList) {
		this.number=number;
		this.tokensList=tokensList;
		
	}
	
	 public int getNumber() {
		 
	        return number;
	    }
	
	 public List<Token> getToken() {
		 
	        return tokensList;
	    }
	 
	 public void setToken(List<Token> tokensList) {
	        this.tokensList = tokensList;
	    }
	 
	
	 public void addToken(Token token)
	    {
	        tokensList.add(token);
	    }
	 @Override
	    public String toString() {
	
	        return 
	                " Token:" + tokensList
	                ;
	    }
}
