/*
 * static ������(������,modifier)
 *   1.���������,�޽�� �տ� ���ϼ��ִ�
 * 	 2.static �����ڰ� �پ��ִ� �������޽���
 *     ��ü���� ���̵� ����̰����ϴ�.
 *   3.Ŭ������ �������ִ� �������޽���̴�.
 *     -->Ŭ��������,Ŭ�����޽�����Ѵ�.
 *   4.Ŭ�����κ��� �����Ǵ� ��ü���� �����ϴ�
 *     ����(�޽��)�̴�.      
 *     -->���뺯��(�޽��)����Ѵ�.
 *     
 *  -����: 
 *  	�������: public static int i;
 * 		����޽��:public static void print(){}
 * 
 */


public class Static {
	public int instance_memeber_field=100;
	public static int static_member_field=200;
	
	public void instance_method() {
		System.out.println("�� �ν��Ͻ�(��ü) �޼ҵ�(this ��� ����)");
	}
	public static void static_method() {
		System.out.println("�� ����(static)�޼ҵ�(this ��� �Ұ���)");
		//System.out.println("�� ����(static)�޼ҵ�"+this);
		// - Cannot use this in a static context
	}

}
