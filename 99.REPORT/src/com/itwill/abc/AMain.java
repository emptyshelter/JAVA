package com.itwill.abc;

import java.util.ArrayList;

public class AMain {

	public static void main(String[] args) {
		B b=new B();
		int a=45;
		int r=b.b1(a);
		System.out.println("AMain��ȯ������===>" + r);
		
		int a1=67;
		String a2="���ӽ�";
		ArgClass arg = b.b2(a1,a2);
		System.out.println("AMain��ȯ������==>"+arg);
		
		ArgClass argObject=new ArgClass(12,"����",3.1111);
		ArrayList<ArgClass> argList = b.b3(argObject);
		System.out.println("AMain��ȯ������==>"+argList);
	}

}







