
public class OverridingChild extends Overriding{
	/*
	 
	public void method1() {
		System.out.println("Overriding.method1()");
	}
	public void method2() {
		System.out.println("Overriding.method2()");
		
	}
	 */
	public void method2() {
		System.out.println("========������ method2()start========");
		System.out.println("Overriding.method2 �� OverridingChild���� ������");
		System.out.println("this:"+this.toString());
		System.out.println("super:"+super.toString());
		/*
		 * super: this�� ���� self ���� ���� 
		 * 		-this�� ���� �ּҸ� ����Ų��.
		 * 		-��ӹ��� �޼ҵ� �߿� �����ǿ� ���ؼ�
		 * 		-����� �޼ҵ忡 ������ �� �ִ�. self �������� 
		 */
		super.method2();
		/*
		 * ��ӹ��� method2()�� ����Ȱ� �������� �޼ҵ常 ȣ��
		 */
		
		System.out.println("========������ method2()end========");
	}
	public void method3() {
		System.out.println("OverridingChild.method3");
		
	}

}
