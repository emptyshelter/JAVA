package com.itwill06.service.account;

/*
 * Account��ü��ü�����õ� ������ ������Ŭ����
 * 		1.���°�ü��(Account[]) ����������ΰ�����.
 * 		2.���°�ü���� ����ؼ� ��������
 */

public class AccountService {

	private Account[] accounts = { new Account(1111, "KIM", 89000, 1.3), new Account(2222, "AIMDDF", 45000, 2.7),
			new Account(3333, "FIMSD", 89000, 4.7), new Account(4444, "XIMSD", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7), new Account(6666, "KIM", 99000, 5.7),
			new Account(7777, "KIM", 95000, 4.7), new Account(8888, "qIMGG", 91000, 1.7),
			new Account(9999, "mIMFF", 12000, 0.7), };

	/*
	 * 0.���°�ü�� ���ڷι޾Ƽ� Account[]���߰�
	 */

	public void addAccount(Account newAccount) {
		Account[] nAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			nAccounts[i] = accounts[i];
		}
		nAccounts[nAccounts.length - 1] = newAccount;
		accounts = nAccounts;
	}	
	 public void addAccount(int no,String owner,int balance ,double iyul) { 
		 Account[] nAccounts = new Account[accounts.length + 1];
			for (int i = 0; i < accounts.length; i++) {
				nAccounts[i] = accounts[i];
			}
			nAccounts[nAccounts.length - 1] = new Account(no, owner, balance, iyul);
			accounts = nAccounts;
		 
	 }
	  
	 
	/*
	 * 1.������µ� �Ѱ��¼���¸޽������
	 */
	public void totAccountNumberPrint() {
		System.out.println(accounts.length);
	}

	/*
	 * 2.������µ� ��ü��¸޽�� ����
	 */
	public void print() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].setOwner(accounts[i].getOwner().substring(0, 1));
			accounts[i].setOwner(accounts[i].getOwner().toUpperCase());
			accounts[i].setOwner(accounts[i].getOwner().concat("****"));
			accounts[i].print();
		}
	}

	/*
	 * 1.ù���� �빮�� 
	 * 2.5�ڸ������ 
	 * 3.ù�����̿ܿ���****(4��) 
	 * ---------------------------------------
	 * ��ȣ �̸� �ܰ� ����
	 * --------------------------------------- 
	 * 1111 K**** 89000 1.3 
	 * 2222 A**** 45000 2.7 
	 * 3333 F**** 23000 4.7 
	 * 4444 X**** 34000 6.7 
	 * 5555 H**** 78000 3.7 
	 * 6666 K**** 99000 5.7 
	 * 7777 K**** 89000 4.7 
	 * 8888 Q**** 91000 1.7 
	 * 9999 M**** 12000 0.7
	 */
	
	/*
	 * 3.������µ� ���ܰ� ��¸޽�� ����
	 */
	public void totBalancePrint() {
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		System.out.println("������µ� ���ܰ�:" + totBalance);
	}

	/*
	 * 4.���¹�ȣ ���ڷι޾Ƽ� �����Ѱ����
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
			}
		}
	}

	/*
	 * 5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ����
	 */
	public void findByBalancePrint(int balance) {
		System.out.println("===========" + balance + "���� ������ ���µ�=============");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				accounts[i].print();
			}
		}
	}

	/*
	 * 6.�������� ���ڷ� �޾Ƽ� �����̻��� ���µ����
	 */
	public void findByIyulPrint(double iyul) {
		System.out.println("=========" + iyul + "���� ������ ���� ���µ�============");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() > iyul) {
				accounts[i].print();
			}
		}
	}

	/*
	 * 7.�������̸� ���ڷ� �޾Ƽ� �����̸��������� ���µ����
	 */
	public void findByNamePrint(String name) {
		System.out.println("=========" + name + "�̶� �̸��� ���� ���µ�============");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner() == name) {
				accounts[i].print();
			}

		}

	}

	/*
	 * 8.���¹�ȣ,�Ա��ҵ� ���ڷ� �޾Ƽ� �Ա�
	 */
	public void ipGum(int no, int money) {
		System.out.println("=========" + money + "�� �Ա�========");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].headerPrint();
				accounts[i].print();
				accounts[i].ipGum(money);
				accounts[i].print();
			}
		}
	}

	/*
	 * 9.���¹�ȣ,����ҵ� ���ڷ� �޾Ƽ� ���
	 */
	public void chulGum(int no, int money) {
		System.out.println("=========" + money + "�� ���========");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].headerPrint();
				accounts[i].print();
				accounts[i].chulGum(money);
				accounts[i].print();
			}
		}
	}

	/*
	 * 10.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() - accounts[j + 1].getBalance() > 0) {
					Account tempBal = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempBal;

				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * 11.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() - accounts[j + 1].getBalance() < 0) {
					Account tempBal = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempBal;

				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	public void updateAccount(Account updateAccount) {
		int no = updateAccount.getNo();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() ==no) {
				accounts[i]= updateAccount;
				accounts[i].setOwner(updateAccount.getOwner());
				accounts[i].setBalance(updateAccount.getBalance());
				accounts[i].setIyul(updateAccount.getIyul());
				updateAccount.print();
				break;
			}
		}
	}

	/*
	 * 15.6666�������� �̸�,�ܰ�,���� ����(update)(X) 15.6666�������� �̸�,�ܰ�,���� ����(update)(X)
	 * 15.6666�������� �̸�,�ܰ�,���� ����(update)(X)
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				accounts[i].setAccountData(no, owner, balance, iyul);
				accounts[i].print();
				break;
			}
		}

	}
}