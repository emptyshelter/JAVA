/*
�߻�Ŭ����
  1.����: �ϳ��̻��� �߻�޼ҵ尡 ���ǵǾ��ִ� Ŭ����
  1.����: �߻�޽�尡 �������� ������
           ��ü������ �������� ���� Ŭ����
     ex> public abstract class Test{
         	//�߻�޽��();
         	public abstract int print(int i);
         	//�����ȸ޽��();
         	public void test(){
         	}
         }
         ==>�߻�޽��: �޽���� �����κ�(�ٵ�)�� ���� ����(prototype)
                         �� �����ϴ� �޽��
            ex> public abstract int print(int i);             
  2. �߻�Ŭ������ �ҿ����� �߻�޽�带 �����Ƿ� ��ü����
      �� �Ұ����ϴ�.
      Test t=new Test();(X)
  3. �߻�Ŭ������ �߻�Ŭ������ ��ӹ޾Ƽ� �߻�޽�带 
     ����(�������̵�)�ϴ� �ڽ� Ŭ������ ����� 
     ���(��ü����)�ؾ��Ѵ� 
*/
public abstract class AbstractClass {
	public void method1() {
		System.out.println("�� �����ȸ޽��");
	}
	public abstract void method2();
}

















