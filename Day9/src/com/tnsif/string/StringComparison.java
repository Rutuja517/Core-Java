package com.tnsif.string;

public class StringComparison {

	public static void main(String[] args) 
	{
		String s1 = "TNSIF"; // string constant pool....dont allow duplicate value points to same 
		String s2 = "TNSIF";
		String s3 = new String("TNSIF"); // heap area...allow 
		String s4 = new String("TNSIF");
		
		// equals operator
		
		System.out.println(("s1==s2 : "+(s1==s2)));
		
		System.out.println((s1==s3));
		
		System.out.println((s4==s3));
		
		// equals method : content comparison
        System.out.println((s1.equals(s2)));
		
		System.out.println((s1.equals(s3)));
		
		System.out.println((s4.equals(s3)));
		
		System.out.println("Hash code of s1 : "+s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		
		System.out.println(s4.hashCode());
		
		// compareTo : unicode
		System.out.println(s1.compareTo("tnsif"));
		
		System.out.println(s1.compareTo("TNSIF"));
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		
		System.out.println(s1.compareTo(s2));	

	}

}
