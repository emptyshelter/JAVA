package com.itwill06.service.car;


public class Car {
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
	
	@Override
	public String toString() {
		return "Car [no=" + no + ", inTime=" + inTime + ", outTime=" + outTime + ", fee=" + fee + "]";
	}


	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}


	/*
	 * ���� 
	 */
	public void ipChar(String no,int inTime) {
		this.setNo(no);
		this.setInTime(inTime);
	}
	/*
	 * ����
	 */
	public void chulCha(int outTime) {
		this.setOutTime(outTime);
		this.calculateFee();
	}
	
	public void calculateFee() {
		this.fee = (this.outTime-this.inTime)*1000;
	}
	public static void headerPrint() {
		System.out.println("*******************************");
		System.out.println("��ȣ\t����\t����\t���");
		System.out.println("*******************************");
	}
	public void print() {
		System.out.println(this.no+"\t"+inTime+"\t"+outTime+"\t"+fee);
		
	}
	//getter,setter
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
}












