package korea.president;

import america.president.Bush;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void mehod1() {
		System.out.println("YS.method1()");
	}
	protected void mehod2() {
		System.out.println("YS.method2()");
	}
	void mehod3() {
		System.out.println("YS.method3()");
	}
	private void mehod4() {
		System.out.println("YS.method4()");
	}
	public void access() {
		/******************������Ű��****************/
		
		DJ dj = new DJ();
		dj.member1=1;
		dj.member2=2;
		dj.member3=3;
//		dj.member4=4;
		dj.mehod1();
		dj.mehod2();
		dj.mehod3();
//		dj.mehod4();
		/*****************�ٸ���Ű��*****************/
		Bush bush = new Bush();
		bush.member1=1;
		/*
		bush.member2=2;
		bush.member3=3;
		bush.member4=4;
		*/
		bush.mehod1();
		/*
		bush.mehod2();
		bush.mehod3();
		bush.mehod4();
		*/
		
		
	}

}
