package com.itwill.account.test;

import java.util.ArrayList;

import com.itwill.account.Account;
import com.itwill.account.AccountService;

public class AccountServiceTestMain {

	public static void main(String[] args) throws Exception{
		AccountService accountService = new AccountService();
		System.out.println("-------------addAccount-----------");
		
		System.out.println(accountService.addAccount(new Account(3313, "BIM", 34000, 4.5)));
		System.out.println(accountService.addAccount(new Account(4567, "VIM", 24000, 3.5)));
		System.out.println(accountService.addAccount(new Account(1233, "CIM", 74000, 3.5)));
		System.out.println(accountService.addAccount(new Account(4453, "ZIM", 84000, 3.5)));
		System.out.println(accountService.addAccount(new Account(2341, "KIM", 99900, 9.9)));
		boolean isSuccess=
				accountService.addAccount(new Account(1111, "SIM", 34000, 4.5));
		if(isSuccess) {
			System.out.println("add success");
		}else {
			System.out.println("add fail");
		}
						
		System.out.println("-------------findAllAccount-----------");
		ArrayList<Account> accountList=
				accountService.findAllAccount();
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("-------------findByNo-----------");
		Account findAccount = accountService.findByNo(2341);
		if(findAccount!=null) {
			findAccount.print();
		}else {
			System.out.println("계좌없다.");
		}
		System.out.println("-------------findByOwner-----------");
		ArrayList<Account> findAccounts=
				accountService.findByOwner("SIM");
		System.out.println(findAccounts);
//		System.out.println("-------------입금-----------");
//		Account acc = accountService.ipGum(3313, 1);
//		System.out.println(acc);
//		System.out.println("-------------출금-----------");
//		acc = accountService.chulGum(1111, 3);
//		System.out.println(acc);
		System.out.println("-------------수정-----------");
		accountService.updateAccount(new Account(1111, "일", 1111111, 1.11));
		System.out.println(accountService.findByNo(1111));
		System.out.println("-------------삭제-----------");
		accountService.deleteAccount(1111);
		System.out.println(accountService.findByNo(1111));
		
	}

}













