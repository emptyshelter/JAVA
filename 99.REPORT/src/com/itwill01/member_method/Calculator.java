package com.itwill01.member_method;
/*
 * 4���� ����޽�带 ����
 */
public class Calculator {
	/*
	 * add( �ΰ��� ������ �μ��� �޾Ƽ� ���Ѱ���� ��ȯ)
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
