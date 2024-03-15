package com.tnsif.day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleCatch 
{
	public static void divide()
	{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter operands for division : ");
	
	try
	{
		a=sc.nextInt();
		b= sc.nextInt();
		c = a/b;
		System.out.println("Division is : "+c);
	}
	catch(InputMismatchException e)
	{
		System.out.println("Invalid Input");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception caught"+e.getMessage());
	}
	catch(Exception e)
	{
		System.out.println("Exception caught"+e.getMessage());
	}
	finally
	{
		sc.close();
	}
	
	}
	
	
}
