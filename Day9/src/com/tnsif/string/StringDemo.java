package com.tnsif.string;

public class StringDemo {
	public static void main(String[] args)
	{
		String a = new String("RutujaGite");  // way1 Heap/string constant pool
		System.out.println(a);	
		
		String a1 ="Gite"; //way 2 string constant pool
		System.out.println(a1);	
		
			
		String r = new String("Rutu");
		r.concat(" Gite"); // immutable
		System.out.println(r);	
		
		
		StringBuffer s = new StringBuffer("Rutu");
		s.append(" Gite"); // mutable
		System.out.println(s);	
		
		System.out.println(s.length());
		
		String w = a.toLowerCase();
		System.out.println(w);
		
		String w1 = a.toUpperCase();
		System.out.println(w1);
		
		String a2 ="RUTUJA";
		System.out.println(a2.compareToIgnoreCase(a));
		
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 6));
		System.out.println(a.subSequence(2, 6));
		
		}
}
