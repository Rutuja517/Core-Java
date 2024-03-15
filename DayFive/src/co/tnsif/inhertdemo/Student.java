package co.tnsif.inhertdemo;

public class Student extends Citizen {

	private int rollnum;
	private String stream;
	private String CollegeName;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public Student(String name, String adharnum, String address, long phnnum, int rollnum, String stream,
			String collegeName) {
		super(name, adharnum, address, phnnum);
		this.rollnum = rollnum;
		this.stream = stream;
		CollegeName = collegeName;
	}
	public Student() {
		super();
	}
//	public Student(String name, String adharnum, String address, int phnnum, int rollnum2, String stream2,
//			String collegeName2) {
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", stream=" + stream + ", CollegeName=" + CollegeName + ", getName()="
				+ getName() + ", getAdharnum()=" + getAdharnum() + ", getAddress()=" + getAddress() + ", getPhnnum()="
				+ getPhnnum() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
