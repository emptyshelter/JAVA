package com.itwill.abc;

import java.util.ArrayList;

public class C {

	public int c1(int a) {
		System.out.println("C.c1() ȣ��");
		System.out.println("a========>"+a);
		System.out.println("C.c1() ��ȯ");
		return a*a;
	}

	public ArgClass c2(int a1, String a2) {
		System.out.println("C.c2() ȣ��");
		System.out.println("a1======>"+a1);
		System.out.println("a2======>"+a2);
		System.out.println("C.c2() ��ȯ");
		ArgClass arg=new ArgClass(343, "������", 2.4545);
		return arg;
	}

	public ArrayList<ArgClass> c3(ArgClass argObject) {
		System.out.println("C.c3() ȣ��");
		System.out.println("argObject===>"+argObject);
		System.out.println("C.c3() ��ȯ");
		ArrayList<ArgClass> argList=new ArrayList<ArgClass>();
		argList.add(new ArgClass(1, "���ȣ", 72.6));
		argList.add(new ArgClass(2, "��ҿ�", 56.8));
		return argList;
	}

}
