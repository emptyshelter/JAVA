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
 *           -����: ���� ȣ���ѳ�(��ü, Ŭ����)�� ����Ÿ�� �־��� ���
 *        	 -����Ÿ��: ���� ȣ���ѳ𿡰� �� ����ŸŸ�� 
 *                     void --> �ٵ���Ÿ�� ���°��
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */

public class MemberMethod {
	int member1;
	void method1() {
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		return;
	}	
	void method2(int count) {		
		for (int i = 0; i < count; i++) {
			System.out.println("method2()");
			}
	}
	void method3(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("method3("+msg+")");			
		}
	}
	void method4(String name,String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name+"��"+msg);
			
		}
	}
	void method5() {
		System.out.println("method5()");
	}

}
