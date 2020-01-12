
public class OverridingChild extends Overriding{
	/*
	 
	public void method1() {
		System.out.println("Overriding.method1()");
	}
	public void method2() {
		System.out.println("Overriding.method2()");
		
	}
	 */
	public void method2() {
		System.out.println("========재정의 method2()start========");
		System.out.println("Overriding.method2 를 OverridingChild에서 재정의");
		System.out.println("this:"+this.toString());
		System.out.println("super:"+super.toString());
		/*
		 * super: this와 같은 self 참조 변수 
		 * 		-this와 같은 주소를 가리킨다.
		 * 		-상속받은 메소드 중에 재정의에 의해서
		 * 		-은폐된 메소드에 접근할 수 있다. self 참조변수 
		 */
		super.method2();
		/*
		 * 상속받은 method2()는 은폐된고 재정의한 메소드만 호출
		 */
		
		System.out.println("========재정의 method2()end========");
	}
	public void method3() {
		System.out.println("OverridingChild.method3");
		
	}

}
