package com.tnsif.array;

// Entity relationship
public class StudMain {

	public static void main(String[] args) {
		Student arr[];
		arr=new Student[5];
		
		arr[0] = new Student(1,"Rutuja");
		arr[1] = new Student(2,"Mansi");
		arr[2] = new Student(3,"Swati");
		arr[3] = new Student(4,"Ashwini");
		arr[4] = new Student(5,"Monika");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Students Array Elements : "+arr[i].getRollno()+" "+arr[i].getName());
		}

	}

}
