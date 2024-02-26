package com.tnsif.day13;

public class EvenOddMain {

	public static void main(String[] args) {
		 Thread evenThread = new Thread(new Even_Odd(true), "Even");
	     Thread oddThread = new Thread(new Even_Odd(false), "Odd");

	        evenThread.start();
	        oddThread.start();
	    }
	

	}


