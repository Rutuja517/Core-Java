package com.tnsif.constructor;

public class constructorDemo {

	private String customerName;
	private int customerId;
	private String customerCity;


	
	  public constructorDemo() { System.out.println("Default Constructor!!!!"); }
	 

	public constructorDemo(String customerName, int customerId, String customerCity) {
		System.out.println("Parameterized Constructor!!!!");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "constructorDemo [Customer Name = " + customerName + ", Customer Id = " + customerId + ", Customer City = "
				+ customerCity + "]";
	}
}
