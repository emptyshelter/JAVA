
public class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * 부모의 기본 생성자 호출 
		 * 부모의 기본 생성자 호출은 생략이 가능하다
		 */
		super();
		System.out.println("Child()디폴트생성자");
		
	}
	public Child(int member1, int member2, int member3) {
		/*
		 * 클래스의 모든 생성자 첫번째 라인에서는
		 * 부오의 기본 생성자 호출한다
		 * 부모의 기본 생성자 호출은 생략이 가능하다.
		 */
		
		super(member1,member2);
		System.out.println("Child(int member1, int member2, int member3)호출");
		/*this.member1=member1;
		this.member2=member2;
		*/
		this.member3=member3;
	}
	
	public void method3() {
		System.out.println("Child.method3()");
	}

}
