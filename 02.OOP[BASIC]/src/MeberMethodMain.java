
public class MeberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm=new MemberMethod();
		mm.member1=10000;
		System.out.println("main�帧 start");
		/*
		 * debug F5
		 */
		/*
		 * ��� �޽�� ���� (ȣ��)
		 * 	-��������.����޽��ĺ���()
		 * 	-mm��ü�� method1 �޽�� ����� �����ϱ� ���ؼ�
		 * 	 ���� �帧(������)�� method1 ������� ������.  
		 */
		mm.method1();
		System.out.println("main1");
		/*
		 * -mm��ü�� method2 ȣ��ÿ� �޼���(������)�� �����Ѵ�.
		 * -ex) mm.method2(3);
		 */
		int a=1;
		mm.method2(a);
		System.out.println("main2");
		mm.method2(1);
		System.out.println("main3");
		mm.method3("�ȳ�",5);
		System.out.println("main4");
		mm.method3("������",2);//���� �μ��� ������ �������� ���� 
		System.out.println("main5");
		mm.method4("KIM","��������",2);
		mm.method4("LEE","�ȳ��ϼ��� ",2);
		
		mm.method5();		
		System.out.println("main�帧 end");
		return;

	}
	
}
