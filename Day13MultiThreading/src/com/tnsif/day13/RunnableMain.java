package com.tnsif.day13;

public class RunnableMain 
{
	public static void main(String args[])
	{
		
		//way1
		UsingRunnable ur = new UsingRunnable(10,20,"Hello");
		
		//way 2....anonymous class
		
		Runnable r = new Runnable()
				{
					public void run()
					{
						System.out.println("Runnable with Anonymous class ");					}
				};
				Thread t1 = new Thread(r);
				t1.start();
		
	}
}
