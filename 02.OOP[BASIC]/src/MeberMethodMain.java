
public class MeberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm=new MemberMethod();
		mm.member1=10000;
		System.out.println("main흐름 start");
		/*
		 * debug F5
		 */
		/*
		 * 멤버 메쏘드 실행 (호출)
		 * 	-참조변수.멤버메쏘드식별자()
		 * 	-mm객체의 method1 메쏘드 블록을 실행하기 위해서
		 * 	 실행 흐름(쓰레드)을 method1 블록으로 보낸다.  
		 */
		mm.method1();
		System.out.println("main1");
		/*
		 * -mm객체의 method2 호출시에 메세지(데이터)를 전달한다.
		 * -ex) mm.method2(3);
		 */
		int a=1;
		mm.method2(a);
		System.out.println("main2");
		mm.method2(1);
		System.out.println("main3");
		mm.method3("안녕",5);
		System.out.println("main4");
		mm.method3("쉬세요",2);//인자 인수의 개수는 적을수록 좋다 
		System.out.println("main5");
		mm.method4("KIM","누구세요",2);
		mm.method4("LEE","안녕하세요 ",2);
		
		mm.method5();		
		System.out.println("main흐름 end");
		return;

	}
	
}
