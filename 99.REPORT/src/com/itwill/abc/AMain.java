package com.itwill.abc;

import java.util.ArrayList;

public class AMain {

	public static void main(String[] args) {
		B b=new B();
		int a=45;
		int r=b.b1(a);
		System.out.println("AMain반환받은값===>" + r);
		
		int a1=67;
		String a2="제임스";
		ArgClass arg = b.b2(a1,a2);
		System.out.println("AMain반환받은값==>"+arg);
		
		ArgClass argObject=new ArgClass(12,"문자",3.1111);
		ArrayList<ArgClass> argList = b.b3(argObject);
		System.out.println("AMain반환받은값==>"+argList);
	}

}







