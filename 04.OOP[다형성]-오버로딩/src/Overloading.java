/*
�����ε�(��������)
  1. �ڹ� ������������� �����ϳ��̴�.
  2. ����: �����޽�� �̸����� �������� �����ϴ¹��
           - ��Ģ: 
               * �޽���� �̸��� ���ƾ��Ѵ�.
               * �޽���� ������ ���ڰ� �ٸ��ų�
               * �޽���� ������ Ÿ���� �޶���Ѵ�.
               * �޽���� ����Ÿ��,���������ڴ� �������.

*/
public class Overloading {
	public void method() {
		System.out.println(">> public void method()");
	}
	public void method(String name) {
		System.out.println(">> public void method(String name):"+ name);	
	}
	public void method(int a) {
		System.out.println(">> public void method(int a):"+a);		
	}	
	/* �޼ҵ��� ����Ÿ���� ������� 
	public void method(int a) {
		System.out.println(">> public void method(int a):"+a);
		
	}
	*/	
	public void method(String msg, int a) {
		System.out.println(">> public void method(String msg ,int a):"+msg+a);		
	}	
	public void method(int a,int b) {
		System.out.println(">> public void method(int a,int b):"+a+b);		
	}	
	

}
