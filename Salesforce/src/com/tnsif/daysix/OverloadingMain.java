package com.tnsif.daysix;

public class OverloadingMain {

	public static void main(String[] args) {
		Method_overloading m= new Method_overloading();
		
		System.out.println(m.addition(10, 20));
		
		System.out.println(Method_overloading.addition(10.5f, 20.54f));
		
		System.out.println(Method_overloading.addition("rutu", "gite"));

	}

}
