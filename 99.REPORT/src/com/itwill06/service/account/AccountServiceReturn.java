package com.itwill06.service.account;

import java.text.FieldPosition;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * 1.���°�ü��(Account[]) ����������ΰ�����.
 * 2.���°�ü���� ����ؼ� ��������
 */
public class AccountServiceReturn {
	public static final int ASCENDING=0;
	public static final int DESCENDING=1;
	
	private Account[] accounts= {
			new Account(1111, "KIM", 85632, 5.9),
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2),
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2),
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2),
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2)
	};
	/*
	 * 0.���°�ü���ڷ� �޾Ƽ� �߰�
	 */
	public void addAccount(Account newAccount) {
		Account[] nAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			nAccounts[i] = accounts[i];
		}
		nAccounts[nAccounts.length - 1] = newAccount;
		accounts = nAccounts;		
	}
	/*
	 * 0.���¹�ȣ ���ڷι޾Ƽ� ��������
	 */
	public void deleteAccount(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i]=null;
				break;
			}
		}
		int count = 0;
		Account[] dAccounts = new Account[accounts.length-1];
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				dAccounts[count++] = accounts[i];
			}
		}
		this.accounts = dAccounts;
	}
	/*
	 * 1.������µ� �Ѱ��¼� ��ȯ�޽��
	 */
	public int getAccountNumber() {
		return accounts.length;
	}
	/*
	 * 2.������µ� ��ü���
	 */
	public void print() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	 * 3.������µ� ���ܰ� ��ȯ�ϴ� �޽��
	 */
	public int getAccountTotalBalance() {
		int tot=0;
		for (int i = 0; i < accounts.length; i++) {
			tot=tot+accounts[i].getBalance();
		}
		return tot;
	}
	
	/*
	 * 4.���¹�ȣ(3333)�� ���ڷι޾Ƽ� ���°�ü�ּ� �Ѱ���ȯ
	 */
	public Account  findByNo(int no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				findAccount=accounts[i];
				break;
			}
		}		
		return findAccount;
	}
	/*
	 * 5.�����ܰ�(50000��)���ڷι޾Ƽ� �ܰ��̻��� ���¹迭��ü ����������ȯ
	 */
	public Account[] findByBalance(int balance) {
		Account[] findAccounts= null;		
		/*
		 * A.�����ϴ°�ü�ǰ������ϱ�
		 * findAccounts=new Account[3];
		 */
		int count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=balance) {
				count++;
			}
		}
		findAccounts= new Account[count];		
		/*
		 * B.�����ϴ°�ü�ּҴ��
		 */
		count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>= balance) {
				findAccounts[count++]= accounts[i];
			}
		}
		return findAccounts;
	}
	/*
	 * 6.��������(5.0)���ڷι޾Ƽ� �����̻��� ���µ�迭��ü ����������ȯ
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findAccounts = null;
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul) {
				count++;
			}
		}
		findAccounts = new Account[count];
		count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul) {
				findAccounts[count] = accounts[i];
				count++;
			}
		}
		return findAccounts;
	}
	
	/*
	 * 7.�������̸�(AIM) ���ڷι޾Ƽ� �̸�����ġ�ϴ°��µ�迭��ü ����������ȯ
	 */
	public Account[] findByOwner(String owner) {
		Account[] findAccounts = null;
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(owner)) {
				count++;
			}
		}		findAccounts = new Account[count];
		count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner() .equals(owner)) {
				findAccounts[count] = accounts[i];
				count++;
			}
		}
		return findAccounts;
	}
	/*
	 * 8.���¹�ȣ(6666��)�� �Ա��ҵ�(4000��)���ڷι޾Ƽ� �Ա�
	 */
	public void ipGum(int no,int m) {
		Account findAccount = this.findByNo(no);
		findAccount.print();
		findAccount.ipGum(m);
		findAccount.print();
	}
	/*
	 * 9.���¹�ȣ(1111��)�� ����ҵ�(5000��)���ڷι޾Ƽ� ���
	 */
	public void chulGum(int no, int m ) {
		Account findAccount = this.findByNo(no);
		findAccount.print();
		findAccount.chulGum(m);
		findAccount.print();
	}
	
	
	/*
		10.���¸� �ܰ������ ������������
		11.���¸� �ܰ������ ������������
	*/
	public void sortByBalance(int type) {
		if(type==AccountServiceReturn.ASCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if(accounts[j].getBalance() > accounts[j + 1].getBalance()) {
						Account tempBalance = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempBalance;
					}
				}
			}
		}else if(type==AccountServiceReturn.DESCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if(accounts[j].getBalance() < accounts[j + 1].getBalance()) {
						Account tempTot = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempTot;
					}
				}
			}
		}
		
	}
//		13.���¸� �������̸���(������)���� ������������
	public void sorByOwner(int type) {
		if (type==AccountServiceReturn.ASCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner())>0) {
						Account tempOwner = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempOwner;							
					}
				}	
			}
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
				break;
			}
		}
	}
		
}
