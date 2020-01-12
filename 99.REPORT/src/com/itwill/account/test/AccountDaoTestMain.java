package com.itwill.account.test;

import com.itwill.account.Account;
import com.itwill.account.AccountDao;
import com.itwill.account.AccountDaoDBImpl;
import com.itwill.account.AccountDaoMemoryImpl;

public class AccountDaoTestMain {

	public static void main(String[] args) throws Exception{
		
//		AccountDao accountDao=new AccountDaoMemoryImpl();
		AccountDao accountDao=new AccountDaoDBImpl();
		boolean isDuplicate = accountDao.isDuplicateNo(4324);
		System.out.println(isDuplicate);
		if(!isDuplicate) {
		System.out.println("--------create----------");
			accountDao.create(new Account(4324, "KKK", 89666, 3.7));
		}
		System.out.println("--------readOne----------");
		Account findAccount=accountDao.readOne(4324);
		System.out.println(findAccount);
		System.out.println("--------readAll----------");
		System.out.println(accountDao.readAll());
		System.out.println("--------update----------");
		accountDao.update(new Account(4324, "Kº¯°æ", 9090, 0.1));
		System.out.println(accountDao.readOne(4324));
		System.out.println("--------delete----------");
		accountDao.delete(4324);
		System.out.println(accountDao.readOne(4324));
		
		

	}

}
