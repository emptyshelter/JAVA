package com.itwill.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.print.attribute.standard.Fidelity;


/*
Dao(Data Access Object)
 - ���°�ü���� �����͸� �����ϰ��ִ� ����(���̺�)��
   CRUD(Create, Read, Update, Delete) �۾��� �Ҽ��ִ�
   �����޽�带 �������ִ� Ŭ����

 - AccountService��ü�� ��û(�޽��ȣ��)�� �޾Ƽ� 
   Data Access(File, DB)�� ���õ� �������(CRUD)��
   �����ϴ� ��ü
 */
public class AccountDaoMemoryImpl implements AccountDao {
	
	private ArrayList<Account>accountList;
	/*
	 * Account ������  �ҽ� 
	 */
	
	public AccountDaoMemoryImpl() throws Exception{
			accountList=new ArrayList();
			accountList.add(new Account(1111, "KIM", 89007, 1.3));
			accountList.add(new Account(2222, "AIM", 45000, 2.7));
			accountList.add(new Account(3333, "FIM", 23000, 4.7));
			accountList.add(new Account(4444, "XIM", 34000, 6.7));
			accountList.add(new Account(5555, "SIM", 78000, 3.7));
			accountList.add(new Account(6666, "AIM", 99000, 5.7));
			accountList.add(new Account(7777, "PIM", 89000, 4.7));
			accountList.add(new Account(8888, "QIM", 91000, 1.7));
			accountList.add(new Account(9999, "MIM", 12000, 0.7));
		
	}
	/*
	 * CREATE
	 */
	@Override
	public void create(Account account) throws Exception{
		accountList.add(account);
	}
	/*
	 * iSDuplicateNo
	 */
	@Override
	public boolean isDuplicateNo(int no) {
		boolean isDuplicate=false;
		for (Account account : accountList) {
			if(account.getNo()==no) {
				isDuplicate=true;
				break;
			}
		}
		return isDuplicate;
	}
	/*
	 * READ ALL
	 */
	@Override
	public ArrayList<Account> readAll() throws Exception{
		for (Account account : accountList) {
			account.print();
		}
		return null;
	}
	/*
	 * READ ONE
	 */
	@Override
	public Account readOne(int no) throws Exception{
		Account returnAccount=null;
		for (Account account : accountList) {
			if (account.getNo()==no) {
				returnAccount=account;
				break;
			}
		}
		return returnAccount;
	}
	/*
	 * READ NAME
	 */
	@Override
	public ArrayList<Account> readName(String name)throws Exception {
		ArrayList <Account>findAccountList=new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getOwner().equals(name)) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}
	/*
	 * READ BALANCE
	 */
	@Override
	public ArrayList<Account> readBalance(int balance)throws Exception {
		ArrayList <Account>findAccountList=new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getBalance()==balance) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}	
	/*
	 * READ IYUL
	 */
	@Override
	public ArrayList<Account> readIyul(double iyul)throws Exception {
		ArrayList <Account>findAccountList=new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getIyul()==iyul) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}	
	/*
	 * ipGum
	 */
	@Override
	public Account ipGum(int no , int money) {
		Account findAccount = null;
		for (Account account : accountList) {
			if (account.getNo()==no) {
				account.ipGum(money);
				findAccount=account;
				break;
			}
		}
		return findAccount;
	}
	/*
	 * chulGum
	 */
	@Override
	public Account chulGum(int no, int money) throws InsufficientBalanceException {
		Account findAccount = null;
		for (Account account : accountList) {
			if (account.getNo()==no) {
				account.chulGum(money);
				findAccount=account;
				break;
			}
		}
		return findAccount;
	}
	
	/*
	 * UPDATE
	 */
	
	@Override
	public void update(Account updateAccount) throws Exception{
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo()==updateAccount.getNo()) {
				accountList.set(i, updateAccount);
				break;
			}
		}
	}
	/*
	 * DELETE
	 */
	@Override
	public void delete(int no) throws Exception{
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo()==no) {
				accountList.remove(i);
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
