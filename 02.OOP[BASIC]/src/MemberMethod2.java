
public class MemberMethod2 {
	/*
	 * ����ʵ� (����)	  
	 */
	
	int member1;
	int member2;
	
	void method1() {
	/*
	 * ���ú���(local)
	 * 	- �޽�� ��� �ȿ����� ��ȿ�� ����	
	 */
		int i=800;
		int j=900;
		System.out.println("local���� i= "+j);
		System.out.println("local���� j= "+i);
		return;
	}
	
	void method2() {
		/*
		 * member1 ,member2 ��������� ���� ���� 
		 * this
		 * 	-self ��������
		 * 	-method2�� �������ִ� ��ü�� �ּҰ�
		 */
		this.member1= 8888;
		this.member2= 9999;
	}
	void method3(int member1, int member2) {
		this.member1=member2;
		this.member2=member1;
	}
	public void print() {
		System.out.println("========print-->this  �ּҰ�("+this+")=========");
		System.out.println("member1="+this.member1);		
		System.out.println("member2="+this.member2);		
		System.out.println("=====================================");
				
	}
}
	