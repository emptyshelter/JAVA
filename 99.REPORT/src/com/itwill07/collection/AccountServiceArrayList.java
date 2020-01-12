package com.itwill07.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;



/*
 * Account��ü��ü�����õ� ������ ������Ŭ����
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;
	public AccountServiceArrayList() {
		accountList=new ArrayList();
		accountList.add(new Account(1111, "KIM", 89007, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 23000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "HIM", 78000, 3.7),
			new Account(6666, "AIM", 99000, 5.7),
			new Account(7777, "PIM", 89000, 4.7),
			new Account(8888, "QIM", 91000, 1.7),
			new Account(9999, "MIM", 12000, 0.7),
	};
	*/
	/*
	 * ������ü��ȯ
	 */
	public ArrayList <Account> getAccountList() {
		return accountList;
	}
	/*
	 * �����߰�
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	/*
	 * ���¹�ȣ�� ���»���
	 */
	public void deleteByAccountNo(int no) {
		
	}
	/*
	 1.������µ� �Ѱ��¼���ȯ�޽������
	 */

	public int totAccountNumber() {
		return accountList.size();
		
	}
	/*
	 * 2.������µ� ��ü��¸޽������
	 */
	public void print() {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
	}
	/*
	 * 3.������µ� ���ܰ� ��ȯ�޽�� ����
	 */
	public int totBalance(){
		int totBalance=0;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			totBalance= totBalance+tempAccount.getBalance();
		}
		
		return totBalance;
	}
	/*
	 4.���¹�ȣ ���ڷι޾Ƽ� �ΰ����Ѱ���ȯ�޽������
	 */
	public Account findByNo(int no) {
		Account findAccount= null;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount= accountList.get(i);
			if (tempAccount.getNo()==no) {
				findAccount=tempAccount;
				break;
			}
		}
		return findAccount;
	}
	/*
	 *  5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ��ȯ
	 */
	public ArrayList <Account>  findByBalance(int balance) {
		ArrayList <Account> findAccountList=new ArrayList<Account> ();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getBalance()>=balance) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	
	/*
	 *  8.6666������ 4000�� �Ա�
	 */
	public void ipGum(int no,int m) {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo()==no) {
				tempAccount.ipGum(m);
			}
		}
	}
	/*
	 *  9.1111������ 5000�� ���
	 */
	public void chulGum(int no,int m) throws InsufficientBalanceException{
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == no) {
				tempAccount.chulGum(m);
				tempAccount.print();
			}
		}
	}
	/*
	 7.������µ� �߿� �������̸��� AIM�� ���µ��ȯ
	*/
	public ArrayList findByName(String owner) {
		ArrayList findAccountList=new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getOwner().equals(owner)) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	/*
	 9.VIP����(�ܰ� 70000���̻�)�� ��ȯ
	 */
	public ArrayList findByVip(int  balance) {
		ArrayList findAccountList = new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getBalance() > balance) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	/*
	 10.���¸� �ܰ������ ������������
	*/
	public void sortByBalanceAsc() {
		Collections.sort(accountList,new ComparatorBalanceAsc());
	}
	/*
	 11.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceDesc() {
		Collections.sort(accountList,new ComparatorBalanceDesc());
		
	}
	
	/*
	 * 
	 15.6666�������� �̸�,�ܰ�,���� ����(update)
	 15.6666�������� �̸�,�ܰ�,���� ����(update)
	 15.6666�������� �̸�,�ܰ�,���� ����(update)
	 */
	public void updateAccount(int no,String owner,int balance,double iyul) {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo()==no) {
				tempAccount.setAccountData(no, owner, balance, iyul);
			}
		}
	}
	
	public void updateAccount(Account updateAccount) {
		for (Account account : accountList) {
			if (account.getNo()==updateAccount.getNo()) {
				account.setAccountData(updateAccount.getNo(), 
									   updateAccount.getOwner(), 
									   updateAccount.getBalance(), 
									   updateAccount.getIyul());
			}
		}
	}
	
	
}















