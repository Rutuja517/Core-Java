package com.tnsif.hirarchical;

public class Employee extends Person{
	private int empId;
	private float Salary;
	private String companyName;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee(String name, String city, int empId, float salary, String companyName) {
		super(name, city);
		this.empId = empId;
		this.Salary = Salary;
		this.companyName = companyName;
	}

	public Employee( int empId, float salary, String companyName) {

		this.empId = empId;
		this.Salary = Salary;
		this.companyName = companyName;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Salary=" + Salary + ", companyName=" + companyName + ", getEmpId()="
				+ getEmpId() + ", getSalary()=" + getSalary() + ", getCompanyName()=" + getCompanyName()
				+ ", getName()=" + getName() + ", getCity()=" + getCity() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
