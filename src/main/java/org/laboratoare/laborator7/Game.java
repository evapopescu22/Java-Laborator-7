package org.laboratoare.laborator7;
import java.util.ArrayList;
import java.util.List;


public class Game extends Thread {
	
	 public static void main(String args[]) {
		 int i=0;
		
		 
		 Runnable runnable1 = new Player("Player 1");
		 new Thread(runnable1).start();
		 Runnable runnable2 = new Player("Player 2");
		 new Thread(runnable2).start();
		 Token token=new Token();
		 Board board = new Board();
		 List<Token> tokensList = new ArrayList<>();
		 while(i<board.getNumber())
		 {
			
			tokensList.add(token);
           			
			 i++;
		 }
		 board.setToken(tokensList);
		 System.out.println(tokensList);
       }
	}