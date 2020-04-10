package org.laboratoare.laborator7;

import java.util.concurrent.Semaphore;

public class Game  {
	
	 public static void main(String args[])  {

		 Semaphore a = new Semaphore(1); 
		 Semaphore b = new Semaphore(0);
		 
		 Player runnable1 = new Player("Player1",a,b);
		 Player runnable2 = new Player("Player2",b,a);
			
		 int i=1;
		 Board board1 = new Board();
		 while(i<=Board.getNumber())
		 {			 
	     Token token = new Token();
		 board1.addToken(token);
		 i++;
		
		 }	
		 System.out.println(board1);
		 Thread thread1 = new Thread(runnable1, "Player1");
		 Thread thread2 = new Thread(runnable2, "Player2");
		 thread1.start();
		 thread2.start();
		 
		 
	        }
	
		 
	    }