
public class InterfaceABImpl 
		extends Object implements InterfaceA, InterfaceB{
	@Override
	public void method1() {
		System.out.println("InterfaceA.method1()����(implement)");
	}
	@Override
	public void method2() {
		System.out.println("InterfaceA.method2()����(implement)");
	}
	@Override
	public void method3() {
		System.out.println("InterfaceB.method3()����(implement)");
	}
	@Override
	public void method4() {
		System.out.println("InterfaceB.method4()����(implement)");
	}

}
