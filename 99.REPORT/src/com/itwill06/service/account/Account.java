package com.itwill06.service.account;

/*
 * �����ǰ��¸� �߻�ȭ�� Ŭ����
 */
public class Account {
	/*
	 * �Ӽ�(attribute) �������
	 */
	private int no;// ���¹�ȣ
	private String owner;// ������
	private int balance;// �ܰ�
	private double iyul;// ����
	/*
	 * ������
	 */

	public Account() {

	}

	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}

	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	/*
	 * ����(operation) ����޽��
	 */
	/*
	 * ���°�ü�� ����Ÿ set �޽��
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	/*
	 * �Ա�
	 */
	public void ipGum(int m) {
		this.balance += m;
	}

	/*
	 * ���
	 */
	public void chulGum(int m) {

		if (this.balance - m < 0) {
			System.out.println(this.owner + " �� �ܰ� �����մϴ�.");
			return;
		}

		this.balance = this.balance - m;
		return;
	}

	/*
	 * �����������
	 */
	public static void headerPrint() {
		System.out.println("-----------------------------");
		System.out.println("��ȣ\t������\t�ܰ�\t����");
		System.out.println("-----------------------------");
	}

	public void print() {

		System.out.println(this.no + "\t" + this.owner + "\t" + this.balance + "\t" + this.iyul);
	}

	// setter,getter
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
