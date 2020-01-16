package com.itwill.servlet.joindb;

public class Join {
	private int no;
	private String id;
	private String name;
	private String job;
	private String address;
//	private String hobbies;
	private String gender;
	
	public Join(int no, String id, String name, String job, String address, String gender) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.job = job;
		this.address = address;
		this.gender = gender;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Join [no=" + no + ", id=" + id + ", name=" + name + ", job=" + job + ", address=" + address
				+ ", gender=" + gender + "]";
	}

}
