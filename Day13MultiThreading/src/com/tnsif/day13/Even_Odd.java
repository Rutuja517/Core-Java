package com.tnsif.day13;

public class Even_Odd implements Runnable{
	
	  private static final int MAX_COUNT = 10;
	    private static final Object lock = new Object();
	    private final boolean isEven;
	    private static int count = 1;

	    public Even_Odd(boolean isEven) {
	        this.isEven = isEven;
	    }

	    @Override
	    public void run() {
	        while (count <= MAX_COUNT) {
	            synchronized (lock) {
	                if ((count % 2 == 0) == isEven) {
	                    System.out.println(Thread.currentThread().getName() + ": " + count);
	                    count++;
	                    lock.notifyAll();
	                } else {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	            try 
	            {
	                Thread.sleep(5000); // Sleep for 5000 milliseconds
	            } 
	            catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }

	  
	       

}
