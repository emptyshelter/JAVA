
public class Parent {
	public int member1;
	public int member2;
	
	public Parent() {
		
		/*
		 * Ŭ������ ��� ������ ù��° ���ο�����
		 * �θ��� �⺻ ������ ȣ��
		 */
		super();
		System.out.println("Parent()����Ʈ������");
		
		//super();
		//Constructor call must be the first statement in a constructor
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	public void method1() {
		System.out.println("Parrent.method1()");
	}
	public void method2() {
		System.out.println("Parrent.method2()");
		
	}

}
