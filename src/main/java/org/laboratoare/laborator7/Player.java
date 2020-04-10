package org.laboratoare.laborator7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Player  implements Runnable  {

    Token[] player1 = new Token[Board.number/2];
	Token[] player2 = new Token[Board.number/2];
    public static  String name;
    Semaphore ins, outs;
  
	
	Player() {
		
	}
	
	public Player ( String name, Semaphore ins, Semaphore outs ) {
		Player.name=name;
		this.ins=ins;
		this.outs=outs;
	
		
	}
	
	public Player ( String name ) {
		Player.name=name;
	
		
	}
	
    public static String getName() {
	        return name;
	    }

	  public void setName(String name) {
	        Player.name = name;
	    }
	  

	  	
	public  void run()  {
		int i=0;
		int j=0;
		while(!Board.tokensList.isEmpty() && win()==0) {
			try {
				ins.acquire();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			  Random rand = new Random();
			 if (!Board.tokensList.isEmpty() ) {
			  Token randomElement = Board.tokensList.get(rand.nextInt(Board.tokensList.size()));
			  
			  if(Thread.currentThread().getName()=="Player1") {
			  player1[i++]=randomElement;
			  }
			  
			  if(Thread.currentThread().getName()=="Player2") {
				  player2[j++]=randomElement;
				  }
			  
			  Board.tokensList.remove(randomElement);
			  System.out.println(Thread.currentThread().getName() + " "+ "extracted:" + randomElement);
		      outs.release();
			   
			      }
			    }
		if(Board.tokensList.isEmpty() && Thread.currentThread().getName()=="Player1" ) 
			System.out.println("Player1 tokens:" + Arrays.toString(player1));
		
		if(Board.tokensList.isEmpty() && Thread.currentThread().getName()=="Player2" ) 
			System.out.println("Player2 tokens:" + Arrays.toString(player2));
		
	    }			 
	     public int win()
	     {
	    	 return 0;
	     }
	  		
	 }