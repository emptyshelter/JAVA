
public class MainThreadCalled {
	public void mainThreadCalledMethod(){
		System.out.println("\tA."+Thread.currentThread().getName()+"������");
		System.out.println("\tB."+Thread.currentThread().getName()+"������");
		return;
	}

}
