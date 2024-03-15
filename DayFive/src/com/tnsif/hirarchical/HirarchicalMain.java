package com.tnsif.hirarchical;

public class HirarchicalMain {
	
	public static void main(String[] args) {
		Person p1=new Person("RUTUJA","NASHIK"); //tightly coupling 
		System.out.println(p1);


		Person p; //obj reference

		p=new Person("MANSI","NASHIK");//loose coupling //dynamic binding
		if(p instanceof Person)
		System.out.println(p);

		p=new Employee("Rutuja","Nashik",06,60000,"TNS");

		if(p instanceof Employee)
			System.out.println(p);

		p=new Doctors("ABC","Pune","Heart","fortis");
		if(p instanceof Doctors)
		System.out.println(p);

	}

}
