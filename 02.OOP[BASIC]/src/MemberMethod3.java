/*
 * class ����
 *  - ����
 *       ����������  class  Ŭ�����̸�{
 *       	- ����������:public,protected,���°�
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -�������
 *     1.�����������(�Ӽ�)
 *        ����������(public,proected,���°�,private) Ÿ�� indentifier;
 *        ex> public String carName;
 *        
 *     2.����޽�� ����(����)    
 *        ���������� ����Ÿ�� �޽���̸�(����){
 *           -����: ���� ȣ���ѳ��� ����Ÿ�� �־��� ���
 *        	 -����Ÿ��: ���� ȣ���ѳ𿡰� �� ����ŸŸ�� 
 *             void --> �ٵ���Ÿ�� ���°��
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */

public class MemberMethod3 {
	void method1() {
		System.out.println("method1()����");
		/*
		 * - �����帧(Thread)�� ȣ���� ������ �ǵ�����
		 * - return type void�� ���� ��������
		 */
		return;
	}
	int method2(){		
		System.out.println("method2()����");
		int a=12;
		int b=23;
		int result=a+b;
		return result;
		//System.out.println("method2()����");
	}
	int add(int a, int b) {
		int result= a+b;
		return result;
	}

}
