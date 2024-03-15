package com.tnsif.hirarchical;

public class Person {
	
	private String Name;
	private String City;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Person(String name, String city) {
		super();
		Name = name;
		City = city;
	}

	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", City=" + City + "]";
	}

}
