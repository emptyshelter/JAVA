
public class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * �θ��� �⺻ ������ ȣ�� 
		 * �θ��� �⺻ ������ ȣ���� ������ �����ϴ�
		 */
		super();
		System.out.println("Child()����Ʈ������");
		
	}
	public Child(int member1, int member2, int member3) {
		/*
		 * Ŭ������ ��� ������ ù��° ���ο�����
		 * �ο��� �⺻ ������ ȣ���Ѵ�
		 * �θ��� �⺻ ������ ȣ���� ������ �����ϴ�.
		 */
		
		super(member1,member2);
		System.out.println("Child(int member1, int member2, int member3)ȣ��");
		/*this.member1=member1;
		this.member2=member2;
		*/
		this.member3=member3;
	}
	
	public void method3() {
		System.out.println("Child.method3()");
	}

}
