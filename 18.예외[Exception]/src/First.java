
public class First {
	private Second second=new Second();
	
	public void method1() throws Throwable {
		System.out.println("\tFirst.method1() ����");
		second.method2();
		System.out.println("\tFirst.method1() ��ȯ");
	}
}
