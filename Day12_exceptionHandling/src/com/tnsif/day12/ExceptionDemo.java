package com.tnsif.day12;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[];
		
		try // only one try is allowed / nested try is allowed
		{
			arr=new int[] {10,20,30,40,50};
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) // multiple catch is allowed
		{
			System.err.println("Specified index does not exist."+e.getMessage());
		}
		finally // only one finally block is allowed
		{
			System.out.println("This is finally block");
		}

	}

}
