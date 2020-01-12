
public class Parent {
	public int member1;
	public int member2;
	
	public Parent() {
		
		/*
		 * 클래스의 모든 생성자 첫번째 라인에서는
		 * 부모의 기본 생성자 호출
		 */
		super();
		System.out.println("Parent()디폴트생성자");
		
		//super();
		//Constructor call must be the first statement in a constructor
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	public void method1() {
		System.out.println("Parrent.method1()");
	}
	public void method2() {
		System.out.println("Parrent.method2()");
		
	}

}
