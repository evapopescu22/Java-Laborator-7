package org.laboratoare.laborator7;

public class Player implements Runnable {


    public String name;
	
	Player() {
		
	}
	
	public Player ( String name ) {
		this.name=name;
		
	}
	
    public String getName() {
	        return name;
	    }

	  public void setName(String name) {
	        this.name = name;
	    }

	public void run() {
	
		System.out.println("Merge");
		
	}
  
    }
	
	

