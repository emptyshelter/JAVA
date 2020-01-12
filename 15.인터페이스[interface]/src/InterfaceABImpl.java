
public class InterfaceABImpl 
		extends Object implements InterfaceA, InterfaceB{
	@Override
	public void method1() {
		System.out.println("InterfaceA.method1()备泅(implement)");
	}
	@Override
	public void method2() {
		System.out.println("InterfaceA.method2()备泅(implement)");
	}
	@Override
	public void method3() {
		System.out.println("InterfaceB.method3()备泅(implement)");
	}
	@Override
	public void method4() {
		System.out.println("InterfaceB.method4()备泅(implement)");
	}

}
