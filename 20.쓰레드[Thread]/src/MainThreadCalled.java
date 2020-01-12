
public class MainThreadCalled {
	public void mainThreadCalledMethod(){
		System.out.println("\tA."+Thread.currentThread().getName()+"쓰레드");
		System.out.println("\tB."+Thread.currentThread().getName()+"쓰레드");
		return;
	}

}
