/**
 * 
 * ���°�ü�� �߻�ȭ�� Ŭ����
 * @author ���ȣ
 * @version 0.01
 */
public class Account {
	/*
	 * �Ӽ�
	 * 	- ����ʵ�
	 */
	/**
	 * ���¹�ȣ
	 */
	private int no;//���¹�ȣ
	/**
	 * ������
	 */
	private String owner;//������
	private int balance;//�ܰ�
	private double iyul;//����
	
	/*
	 * ����(operation)
	 *  - ����޽��
	 */
	
	/*
	 * ���µ���Ÿset�޽��
	 */
	/**
	 * ���µ���Ÿ�� set �ϴ¸޽��
	 * @param no ���¹�ȣ
	 * @param owner ������
	 * @param balance �ܰ�
	 * @param iyul ����
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul = iyul;
	}
	/*
	 * �Ա�
	 */
	/**
	 * �Ա�
	 * @param m �Ա��ҵ�
	 */
	public void ipGum(int m) {
		//this.balance+=m;
		this.balance=this.balance+m;
	}
	/*
	 * ���
	 */
	/**
	 * ���
	 * @param m ��ݾ�
	 * @return if true ��ݼ��� else ��ݽ���
	 */
	public boolean chulGum(int m) {
		boolean isSuccess=false;
		this.balance=this.balance-m;
		if(this.balance < 0) {
			this.balance = this.balance+m;
			isSuccess=false;
		}else {
			isSuccess=true;
		}
		return isSuccess;
	}
	/*
	 * header print
	 */
	/**
	 * ����������
	 */
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %s %s %s%n","��ȣ","������","�ܰ�","����");
		System.out.println("-------------------------");
	}
	/*
	 * ���
	 */
	/**
	 * �����������
	 */
	public void print() {
		
		System.out.printf("%d %6s %d %4.1f%n",this.no,this.owner,this.balance,this.iyul);
	}
	/*
	 * getter,setter ����Ű
	 *   << alt + shift + s >> --> r
	 */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
	
}









