/*
 ��ü������������ȯ
   1. �θ��ڽİ��迡�ִ� Ŭ���� �鿡���� �����ϴ�.
   2. �ڽİ�ü���������� �θ�Ŭ����Ÿ�� ���������� ����ȯ
       - �ڵ����� �̷������(������)
       Child c = new Child();
       Parent pppp = c; 
   3. �θ� ��ü���������� �ڽ�Ŭ����Ÿ�� ���������� ����ȯ
       - ��Ģ�����δ� �Ұ����ϴ�
       - �θ��� Ż���� �ڽİ�ü �� �����ϴ�.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildObjectTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("-------------Child---------------");
		Child c1=new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		/*
		 2. �ڽİ�ü���������� �θ�Ŭ����Ÿ�� ���������� ����ȯ
	       - �ڵ����� �̷������(������)
		       Child c = new Child();
		       Parent pppp = c; 
		 */
		Parent p1 = c1;
		p1.method1();
		p1.method2();
		p1.method3();
		
		/*
		p1.method4();
		p1.method5();  
		 */
		System.out.println("==============Parent-->Child==============");
		Parent p2 = new Parent();
		
		//Child c2 =p2;
		//Type mismatch: cannot convert from Parent to Child
		/*
		<<����ÿ� ���ܹ߻�>>
		Child c2 = (Child)p2;
		Exception in thread "main" java.lang.ClassCastException: Parent cannot be cast to Child
		*/
		//- �θ��� Ż���� �ڽİ�ü �� �����ϴ�.
		
		Parent p3 = new Child();
		p3.method1();
		/*
		 * �����ǵ� �޼ҵ�� Parent type���ε� �ڽ��Ǹ޼ҵ� ȣ���� �����ϴ�
		 */
		p3.method2();
		p3.method3();
		/*
		p3.method4();
		p3.method5();
		*/
		Child c3 = (Child)p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
	}

}










