import java.awt.Container;

public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("----------------new Constructor()----------------");
		Constructor c1 = new Constructor();
		c1.setConstructorData(111, 222);
		/*
		 * - ��ü������ �ٷ� ������ �޼ҵ� ȣ��ȴ�
		 * - ������ �޼ҵ�� �����Ŀ� ��ü�ּҸ� ��ȯ�Ѵ�.
		 */
		System.out.println(c1);
		//c1.Constructor (xxxxx)
		c1.print();
		System.out.println("----------------new Constructor(343)----------------");
		Constructor c2=new Constructor(7777);
		c2.print();
		System.out.println("----------------new Constructor(343,333)----------------");
		Constructor c3=new Constructor(333, 444);
		c3.print();
		
		System.out.println("----------------Default Constructor----------------");
		DefaultConstructor defaultConstructor =new DefaultConstructor();
		System.out.println(defaultConstructor);
		
	}

}
