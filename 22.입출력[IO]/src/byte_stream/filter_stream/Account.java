package byte_stream.filter_stream;

import java.io.Serializable;

import javax.naming.InsufficientResourcesException;

/*
 * ������°�ü�� �߻�ȭ��Ŭ����
 */
public class Account implements Serializable{
	/*
	 * �Ӽ�(�������)
	 */
	private int no;//���¹�ȣ
	private String owner;//������
	private int balance;//�ܰ�
	private double iyul;//����
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}


	/*
	 * ����(����޽��)
	 * 
	 * �Ա�
	 * ���
	 * �����������
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.setIyul(iyul);
	}
	
	public void ipGum(int m) {
		this.balance = this.balance + m;
	}
	public void chulGum(int m) throws Exception{
		if(this.balance-m < 0) {
			throw new Exception(this.owner+" �� �ܰ� �����մϴ�.");
			
		}
		
		this.balance=this.balance-m;
		return;
	}
	public static void headerPrint() {
		System.out.println("---------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ܰ�\t����");
		System.out.println("---------------------------------------");
	}
	public void print() {
		System.out.println(
				this.no+"\t"+this.owner+"\t"+this.balance+"\t"+this.iyul);
	}
	public void printNameFormat() {
		/*
		 1.ù���� �빮��
		 2.5�ڸ������
		 3.ù�����̿ܿ���****(4��)
		---------------------------------------
		��ȣ	�̸�	 �ܰ�	 ����
		---------------------------------------
		1111	K****	 89000	 1.3
		2222	A****	 45000	 2.7
		3333	F****	 23000	 4.7
		4444	X****	 34000	 6.7
		5555	H****	 78000	 3.7
		6666	K****	 99000	 5.7
		7777	K****	 89000	 4.7
		8888	Q****    91000	 1.7
		9999	M****    12000	 0.7
		*/	
		System.out.println(
				this.no+"\t"+this.owner+"\t"+this.balance+"\t"+this.iyul);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}
	
	//getter,setter
	/*
	 * alt + shift + s
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
