package org.laboratoare.laborator7;

import java.util.Random;

public class Token {
	
	int m=100;
	Random r = new Random();
	int randomInt = r.nextInt(m) + 1;
	
	Token()
	{
		
	}
	
	public Token ( int randomInt ) {
		this.randomInt=randomInt;
		
	}
	
	  public int getNumer() {
	        return randomInt;
	    }
	  
	  @Override
	    public String toString() {
	
	        return 
	                " \nToken:" + randomInt
	                ;
	    }

}