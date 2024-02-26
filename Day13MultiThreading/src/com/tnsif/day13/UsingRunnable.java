package com.tnsif.day13;

public class UsingRunnable implements Runnable
{
	Thread t;
	int l,h;
	String msg;
	
	
	public UsingRunnable(int l, int h, String msg) {
		
		this.l = l;
		this.h = h;
		this.msg = msg;
		t = new Thread(this,"Child Thread");
		t.start();
	}


	@Override
	public void run()
	{
		for(int i=1;i<=h;i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(msg+i);
		}
	}
}
