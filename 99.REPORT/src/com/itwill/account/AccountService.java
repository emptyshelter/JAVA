package com.itwill.account;

import java.util.ArrayList;

/*
 * ���� ������ ������Ŭ����
 *  - Account��ü�� ���(����������)
 *  - ��������� DataAccess�� �ʿ��ϸ� AccounDao�� ����Ѵ�.
 *  - AccountDao ��ü�� ����ؼ� ��������.
 *  - AccountDao ��ü�� �����ϰ��ִ�.
 */
 
public class AccountService {
	private AccountDao accountDao;
	
	public AccountService() throws Exception{
//		accountDao= new AccountDaoFileImpl();
		accountDao= new AccountDaoDBImpl();
	}
	/*
	 * ���»���
	 *  - ���¹�ȣ�ߺ��� üũ�ϰ�  �ߺ��ȵǸ� ����
	 */
	public boolean addAccount(Account addAccount) throws Exception{
		boolean isCreate=false;
		if(!accountDao.isDuplicateNo(addAccount.getNo())) {
			accountDao.create(addAccount);
			isCreate=true;
		}else {
			isCreate=false;
		}
		return isCreate;
	}
	
	/*
	 * ���¹�ȣ�� 1���˻��Ĺ�ȯ
	 */
	
	public Account findByNo(int no) throws Exception{
		Account findAccount = accountDao.readOne(no);
		return findAccount;
	}
	
	/*
	 * ���¿����� ��ü�˻�
	 * ���¿����� �̸����ΰ˻�
	 * ���¿����� �ܰ�ΰ˻�
	 * ���¿����� �����ΰ˻�
	 */
	/*
	 ���¿����� ��ü�˻�
	 */
	public ArrayList<Account> findAllAccount() throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList= accountDao.readAll();
		return findAccountList;
	}
	/*
	 * ���¿����� �̸����ΰ˻�
	 */
	public ArrayList<Account> findByOwner(String owner) throws Exception{
		ArrayList<Account> findAccountList=accountDao.readName(owner);
		return findAccountList;
	} 
	/*
	 * ���¿����� �ܰ�� �˻�
	 */
	public ArrayList<Account> findByBalance(int balance) throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList=accountDao.readBalance(balance);
		return findAccountList;
	}
	/*
	 * ���¿����� ������ �˻� 
	 */
	public ArrayList<Account> findByIyul(double iyul) throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList = accountDao.readIyul(iyul);
		return findAccountList;
	}	
	/*
	 * �Ա�
	 */
	public Account ipGum(int no,int money) throws Exception{
		Account acc=null;
		acc= accountDao.ipGum(no, money);
		return acc;
	}
	
	/*
	 * ���
	 */
	public Account chulGum(int no,int money) throws Exception{
		Account acc=null;
		acc = accountDao.chulGum(no, money);
		return acc;
	}
	/*
	 * ���¼���
	 */
	public void updateAccount(Account updateAccount) throws Exception {
		 accountDao.update(updateAccount);
	}
	/*
	 * ���»���
	 */
	public void deleteAccount(int no) throws Exception{
		accountDao.delete(no);
	}
	
}















