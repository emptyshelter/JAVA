package com.itwill.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AccountDaoFileImpl implements AccountDao{
	/*
	 * Account데이타소스
	 */
	private File memberFile;
	public AccountDaoFileImpl() throws Exception{
		init();
		
	}
	private void init()  throws Exception{
		memberFile=new File("accounts.ser");
		if(!memberFile.exists()) {
			System.out.println("--------파일생성[accounts.ser]------");
			ObjectOutputStream oos=
					new ObjectOutputStream(
							new FileOutputStream(memberFile));
			oos.writeObject(new ArrayList<Account>());
			
		}else {
			System.out.println("--------파일존재[accounts.ser]------");
		}
	}
	/*
	 * accounts.ser[DataSource] --> ArrayList<Account>
	 */
	private ArrayList<Account> readFile() throws Exception{
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream(memberFile));
		ArrayList<Account> accountList = 
				(ArrayList<Account>)ois.readObject();
		ois.close();
		return accountList;
	}
	/*
	 * ArrayList<Account> --> accounts.ser[DataSource] 
	 */
	private void writeFile(ArrayList<Account> accountList) throws Exception {
		ObjectOutputStream oos=
				new ObjectOutputStream(
						new FileOutputStream(memberFile));
		oos.writeObject(accountList);
		oos.close();
	}
	
	@Override
	public void create(Account account) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		accountList.add(account);
		this.writeFile(accountList);
	}

	@Override
	public boolean isDuplicateNo(int no) throws Exception {
		boolean isDuplicate=false;
		ArrayList<Account> accountList=this.readFile();
		for (Account account : accountList) {
			if(account.getNo()==no) {
				isDuplicate=true;
				break;
			}
		}
		return isDuplicate;
	}

	@Override
	public ArrayList<Account> readAll() throws Exception {
		ArrayList<Account> accountList = this.readFile();
		return accountList;
	}

	@Override
	public Account readOne(int no) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		for (Account account : accountList) {
			if (account.getNo()==no) {
				return account;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Account> readName(String owner) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		ArrayList<Account> tempAccount = new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getOwner().equals(owner)) {
				tempAccount.add(account);
			}
		}
		return tempAccount;
	}

	@Override
	public ArrayList<Account> readBalance(int balance) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		ArrayList<Account> tempAccount = new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getBalance()==balance) {
				tempAccount.add(account);
			}
		}
		return tempAccount;
	}

	@Override
	public ArrayList<Account> readIyul(double iyul) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		ArrayList<Account> tempAccount = new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getIyul()==iyul) {
				tempAccount.add(account);
			}
		}
		return tempAccount;
	}

	@Override
	public Account ipGum(int no, int money) throws Exception ,InsufficientBalanceException{
		ArrayList<Account> accountList = this.readFile();
		for (Account account : accountList) {
			if (account.getNo()==no) {
				account.ipGum(money);
				this.writeFile(accountList);
				return account;
			}
			break;
		}
		return null;
	}

	@Override
	public Account chulGum(int no, int money) throws Exception ,InsufficientBalanceException{
		ArrayList<Account> accountList = this.readFile();
		for (Account account : accountList) {
			if (account.getNo()==no) {
				account.chulGum(money);
				this.writeFile(accountList);
				return account;
			}
		}
		return null;
	}

	@Override
	public void update(Account updateAccount) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo()==updateAccount.getNo()) {
				accountList.set(i, updateAccount);
				this.writeFile(accountList);
			}
		}
	}

	@Override
	public void delete(int no) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo()==no) {
				accountList.remove(i);
				this.writeFile(accountList);
			}
		}
	}
	

}
