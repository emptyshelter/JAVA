package com.itwill.abc;

public class ArgClass {
	private int a;
	private String b;
	private double c;
	public ArgClass() {
		// TODO Auto-generated constructor stub
	}
	public ArgClass(int a, String b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "ArgClass [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
}
