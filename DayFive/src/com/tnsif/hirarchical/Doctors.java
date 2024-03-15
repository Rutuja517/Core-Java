package com.tnsif.hirarchical;

public class Doctors extends Person {
	private String specialization;
	private String hospitalName;

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Doctors(String name, String city, String specialization, String hospitalName) {
		super(name, city);
		this.specialization = specialization;
		this.hospitalName = hospitalName;
	}
	public Doctors(String name, String city) {

	}
	@Override
	public String toString() {
		return "Doctors [specialization=" + specialization + ", hospitalName=" + hospitalName + ", getSpecialization()="
				+ getSpecialization() + ", getHospitalName()=" + getHospitalName() + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
