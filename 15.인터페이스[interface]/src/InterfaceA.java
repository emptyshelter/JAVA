/*
 �������̽�
    1. Ŭ���������� ��� �޽�尡 �߻�޽����
    2. ���߻���� ȿ���� ��
       (Ŭ������ �Ұ����ϳ� �������̽��°����ϴ�)
   -����
     * class keyword ��ſ� interface ��� keyword�����
     * �߻�޽��տ� abstract �� �������ʾƵ��ȴ�.
     ex>public interface Test{
     		public void method1();
     		public void method2();
        }
   - ���
       1. interface�� ���(implements)�޾Ƽ�
       2. �߻�޽�带 ������(����)���� ����Ѵ�.
       
       ex> public class TestImpl implements Test{
       			public void method1(){}
     			public void method2(){}
          }
*/
public interface InterfaceA {
	public void method1();
	public abstract void method2();
	/*
	 * Abstract methods do not specify a body
	 * public void method3() {
	 * }
	 */
		
	

}
