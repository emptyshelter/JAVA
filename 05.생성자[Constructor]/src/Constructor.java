/*
�����ڸ޼ҵ�(constructor)
1. Ŭ���� �̸��������ϸ� ����Ÿ���� ��������ʴ� �޽��(???)
2. �ϳ��� Ŭ�������� �ݵ�� �ϳ��̻��� �����ڰ� �����Ͽ����Ѵ�
--> �����ڸ� ��������������� �����Ϸ��� ���ڰ��ϳ�������
    ������(����Ʈ ������)�� �ڵ����� �־ �������Ѵ�.    
3. ��ü������ ���ѹ� ȣ��ȴ�.
4. �ַ� ��ü�ʱ�ȭ�� �뵵�� ����Ѵ�.
5. ��ü�� �����ҷ��� �ݵ�� �����ڸ� ȣ���Ͽ����Ѵ�.
	
	-����: 
	 	public class Test{
	 		//�������� ����(����)
	 	    public Test(){
	 	    }
	 	}
	 	
    -���: 
           Test t = new Test(); 
	 	   Ŭ������ ���������̸� = new Ŭ������();
	 	   new ��� �����ڴ� �ݵ�� ������ �տ��־���ϸ�
	 	   �̿����ڿ����� ��ü�� �����Ѵ�.
*/





public class Constructor {
	private int member1;
	private int member2;	
	//Ŭ���� �̸��������ϸ� ����Ÿ���� ��������ʴ� �޽��(???)
	//�������� �����ε�
	public Constructor() {
		System.out.println("Constructor()�⺻������ȣ��:"+this);		
	}
	public Constructor(int member1) {
		System.out.println("Constructor(int member1)������ȣ��:"+this);	
		//�ַ� ��ü�ʱ�ȭ�� �뵵�� ����Ѵ�.
		this.member1=member1;//this�� �ݵ�� ����ؾ��Ѵ�.
		this.member2=45344534;		
	}
	public Constructor(int member1,int member2) {
		System.out.println("Constructor(int member1)������ȣ��:"+this);	
		this.member1=member1;
		this.member2=member2;		
	}
	public void setConstructorData(int member1,int member2) {
		this.member1=member1;
		this.member2=member2;		
	}
	public void print() {
		System.out.println("member1:"+member1);
		System.out.println("member2:"+member2);
	}
}
