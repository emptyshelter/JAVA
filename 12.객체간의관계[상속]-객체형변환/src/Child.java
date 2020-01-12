
public class Child extends Parent {
	
	@Override
	public void method2() {
		System.out.println("Child.method2() 재정의");
	}	
	@Override
	public void method3() {
		System.out.println("Child.method3() 재정의");
		
	}
	public void method4() {
		System.out.println("Child.method4()");	
	}
	public void method5() {
		System.out.println("Child.method5()");		
	}

}
