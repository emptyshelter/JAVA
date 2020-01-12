package com.itwill01.member_method;
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * substract
	 * div
	 * multiple
	 */
	private Calculator() {
		
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
}
