/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수변수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
/****************FinalClass*********************/
class FinalClass{
	public final int PORT_NUMBER=80;
	public final int INCENTIVE_RATE;
	
	public final static int NORTH=0;
	public final static int SOUTH=1;
	public final static int EAST=2;
	public final static int WEST=3;
	
	public FinalClass() {
		this.INCENTIVE_RATE = 10;
		/*
		The final field FinalClass.PORT_NUMBER cannot be assigned
		this.PORT_NUMBER=8080;
		INCENTIVE_RATE=20;
		FinalClass.NORTH = 5;
		 */
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
	}
	public void move(int direction) {
		switch (direction) {
		case FinalClass.NORTH:
			System.out.println("move north");
			break;
		case FinalClass.SOUTH:
			System.out.println("move south");
			break;
		case FinalClass.EAST:
			System.out.println("move east");
			break;
		case FinalClass.WEST:
			System.out.println("move west");
			break;
		}
		
	} 
	
	public void method1() {
		System.out.println("FinalClass.method1()");
	}
	public final void method2() {
		System.out.println("FinalClass.method2():"
				+ "난 final메소드 재정의 금지");
	}
	
	
}
/********************FinalClassChild*******************/
class FinalChild extends FinalClass{
	@Override
	public void method1() {
		System.out.println("FinalChild에서 Final.method1() 재정의");
	}
	/*
	<< Cannot override the final method from FinalClass >>
	public void method2() {
		
	}
	*/
}
/******************FinalClassMain******************/
public class FinalClassMain {

	public static void main(String[] args) {
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		
		FinalClass fc1=new FinalClass();
		/*
		The final field FinalClass.INCENTIVE_RATE cannot be assigned
		fc1.INCENTIVE_RATE=30;
		fc1.PORT_NUMBER=9090;
		FinalClass.NORTH=9;
		*/
		System.out.println(fc1.INCENTIVE_RATE);
		System.out.println(fc1.PORT_NUMBER);
		
		FinalClass fc2=new FinalClass();
		System.out.println(fc2.INCENTIVE_RATE);
		System.out.println(fc2.PORT_NUMBER);
		
		fc2.move(FinalClass.SOUTH);
		fc2.move(FinalClass.NORTH);
		fc2.move(FinalClass.EAST);
		fc2.move(FinalClass.WEST);
		System.out.println("*********FinalChild*************");
		FinalChild finalChild=new FinalChild();
		finalChild.method1();
		finalChild.method2();
		
		/*
		finalChild.INCENTIVE_RATE=50;
		*/
		System.out.println(finalChild.INCENTIVE_RATE);
		System.out.println(finalChild.PORT_NUMBER);
		
		System.out.println("--------Parent static member변수---------------");
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.SOUTH);
		System.out.println(FinalClass.NORTH);
		
		/*
		 * System.out.println("--------Child static member변수---------------");
		 * System.out.println(FinalChild.EAST); 
		 * System.out.println(FinalChild.WEST);
		 * System.out.println(FinalChild.SOUTH); 
		 * System.out.println(FinalChild.NORTH);
		 */	}

}










