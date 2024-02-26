package com.tnsif.day13;

public class ThreadMain {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5,"First");
		ChildThread t2 = new ChildThread(6,"Second");
	
		t1.start();
		t2.start();
	}

}
