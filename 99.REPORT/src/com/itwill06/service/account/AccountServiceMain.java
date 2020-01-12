package com.itwill06.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		System.out.println("0.Account추가");
		
		accountService.addAccount(new Account(8989, "NEW1", 898989, 0.2));
		accountService.print();
		accountService.addAccount(new Account(4567, "NEW2", 787878, 3.2));
		
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService야은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();
		System.out.println("4.AccountService야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(2222);		
		accountService.findByNoPrint(4444);
		accountService.findByNoPrint(7777);
		accountService.findByNoPrint(1111);
		System.out.println("5.AccountService야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(50000);
		accountService.findByBalancePrint(60000);
		accountService.findByBalancePrint(12000);
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.findByIyulPrint(0.7);
		accountService.findByIyulPrint(2.4);
		accountService.findByIyulPrint(3.0);
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("XIMSD");
		accountService.findByNamePrint("KIM");
		accountService.findByNamePrint("qIMGG");		
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(3333, 50000);
		accountService.ipGum(4444, 80000);
		accountService.ipGum(6666, 100000);		
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(1111, 55000);
		accountService.chulGum(8888, 25000);
		accountService.chulGum(9999, 15000);
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.sortByBalanceAscending();
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.sortByBalanceDescending();
		/*
		 * 15.6666번계좌의 이름,잔고,이율 수정(update)		  
		 */
		System.out.println("12.AccountService야 6666번계좌의 이름,잔고,이율 수정해줘");
		Account updateAccount=new Account(6666, "CHANGE", 2222, 3.3);
		accountService.updateAccount(updateAccount);
		/*
		 15.6666번계좌의 이름,잔고,이율 수정(update)
		 */
		System.out.println("12-1.AccountService야 6666번계좌의 이름,잔고,이율 수정해줘");
		accountService.updateAccount(6666, "변경후!BANG", 44444, 9.9);
	}

}
