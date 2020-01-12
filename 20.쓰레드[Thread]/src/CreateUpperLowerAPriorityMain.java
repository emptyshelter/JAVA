
public class CreateUpperLowerAPriorityMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		CreateLowerAThread la = new CreateLowerAThread();
		CreateUpperAThread ua = new CreateUpperAThread();
		int lp = la.getPriority();
		int up = ua.getPriority();
		System.out.println("lp:"+lp);
		System.out.println("up:"+up);
		la.setPriority(1);
		ua.setPriority(10);
		System.out.println("2.main");
		la.start();
		ua.start();
		System.out.println("3.main");

	}

}
