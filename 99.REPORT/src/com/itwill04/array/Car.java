package com.itwill04.array;

public class Car {
	/*
	 * 멤버변수선언(속성)
	 */
	private static int feePerHour=1000;
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	public Car(String no,int inTime,int outTime,int fee) {
		this.no=no;
		this.inTime=inTime;
		this.outTime=outTime;
		this.fee=fee;
	}
	
	/*
	 * 멤버메쏘드(행위)
	 */
	
	//1.입차
	public void ipCha(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	//2.출차
	public void chulCha(int outTime) {
		this.setOutTime(outTime);
		this.calculateFee();
		this.print();
		/*
		this.outTime=outTime;
		this.fee=(this.outTime-this.inTime)*1000;
		System.out.println("------------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		*/
		
	}
	
	//2-1.출차시간대입(출차)
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	//2-2.요금계산(출차)
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*Car.feePerHour;
	}
	
	//2-3.영수증출력(출차)
	public void print() {
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
	}
	public static void headerPrint() {
		System.out.println("------------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------------");
	}
	//getter setter
	
	/**
	 * @return
	 */
	public String getNo() {
		return no;
	}
	public static int getFeePerHour() {
		return feePerHour;
	}

	public static void setFeePerHour(int feePerHour) {
		Car.feePerHour = feePerHour;
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
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
}















