
public class Second {
	private Third third=new Third();
	public void method2() throws Throwable {
		System.out.println("\t\tSecond.method2() 실행");
		third.method3();
		System.out.println("\t\tSecond.method2() 반환");
	}
}
