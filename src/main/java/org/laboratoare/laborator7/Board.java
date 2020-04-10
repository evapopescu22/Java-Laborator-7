package org.laboratoare.laborator7;
import java.util.ArrayList;
import java.util.List;



public class Board {
	
	static int number=6;
	static List<Token> tokensList = new ArrayList<>();
	
	public Board() {
		
	}
	
	public Board ( int number, List<Token> tokensList) {
		Board.number=number;
		Board.tokensList=tokensList;
		
	}
	
	 public static int getNumber() {
		 
	        return number;
	    }
	
	 public List<Token> getToken() {
		 
	        return tokensList;
	    }
	 
	 public void setToken(List<Token> tokensList) {
	        Board.tokensList = tokensList;
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

