package com.itwill.abc;

import java.util.ArrayList;

public class B {
	private C c ;
	public B() {
		c = new C();
	}
	public int b1(int a) {
		System.out.println("B.b1() ȣ��");
		int r=c.c1(a);
		System.out.println("B.b1() ��ȯ");
		return r+3; 
	}
	public ArgClass b2(int a1, String a2) {
		System.out.println("B.b2() ȣ��");
		ArgClass arg=c.c2(a1,a2);
		System.out.println("B.b2() ��ȯ");
		return arg;
	}
	public ArrayList<ArgClass> b3(ArgClass argObject) {
		System.out.println("B.b3() ȣ��");
		ArrayList<ArgClass> argList=c.c3(argObject);
		System.out.println("B.b3() ��ȯ");
		return argList;
	}

}
