package co.tnsif.inhertdemo;

public class Citizen {

		private String Name;
		private String Adharnum;
		private String address;
		private long phnnum;

		//use getter and setter
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAdharnum() {
			return Adharnum;
		}
		public void setAdharnum(String adharnum) {
			Adharnum = adharnum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhnnum() {
			return phnnum;
		}
		public void setPhnnum(long phnnum) {
			this.phnnum = phnnum;
		}
		//parametrize constructor
		public Citizen(String name, String adharnum, String address, long phnnum) {
			super();
			Name = name;
			Adharnum = adharnum;
			this.address = address;
			this.phnnum = phnnum;
		}
		//default contructor
		public Citizen() {

		}
		//to string method
		@Override
		public String toString() {
			return "Citizen [Name=" + Name + ", Adharnum=" + Adharnum + ", address=" + address + ", phnnum=" + phnnum + "]";
		}

		
		
		

		

	}


