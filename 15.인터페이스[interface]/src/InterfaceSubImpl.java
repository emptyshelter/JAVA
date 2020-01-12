
public class InterfaceSubImpl implements InterfaceSub {

	@Override
	public void method_super() {
		System.out.println("InterfaceSuper.method_super() 구현(implement)");
	}

	@Override
	public void method_sub() {
		System.out.println("InterfaceSub.method_sub() 구현(implement)");
	}
	
}
