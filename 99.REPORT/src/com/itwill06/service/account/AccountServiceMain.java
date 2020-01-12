package com.itwill06.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		System.out.println("0.Account�߰�");
		
		accountService.addAccount(new Account(8989, "NEW1", 898989, 0.2));
		accountService.print();
		accountService.addAccount(new Account(4567, "NEW2", 787878, 3.2));
		
		System.out.println("1.AccountService�� ������µ� �Ѱ��¼��������");
		accountService.totAccountNumberPrint();
		System.out.println("2.AccountService�� ������µ� ��ü�������");
		accountService.print();
		System.out.println("3.AccountService��������µ� ���ܰ� �������");
		accountService.totBalancePrint();
		System.out.println("4.AccountService�� ���¹�ȣ�ٲ� �����Ѱ��������");
		accountService.findByNoPrint(2222);		
		accountService.findByNoPrint(4444);
		accountService.findByNoPrint(7777);
		accountService.findByNoPrint(1111);
		System.out.println("5.AccountService�� �����ܰ��ٲ� �ܰ��̻��� ���µ��������");
		accountService.findByBalancePrint(50000);
		accountService.findByBalancePrint(60000);
		accountService.findByBalancePrint(12000);
		System.out.println("6.AccountService�� �������� ���ڷ��ٲ� �����̻��� ���µ��������");
		accountService.findByIyulPrint(0.7);
		accountService.findByIyulPrint(2.4);
		accountService.findByIyulPrint(3.0);
		System.out.println("7.AccountService�� �������̸� ���ڷ��ٲ� �������̸�����ġ�ϴ� ���µ��������");
		accountService.findByNamePrint("XIMSD");
		accountService.findByNamePrint("KIM");
		accountService.findByNamePrint("qIMGG");		
		System.out.println("8.AccountService�� ���¹�ȣ,�Ա��ҵ� ���ڷ��ٲ� �Ա�����");
		accountService.ipGum(3333, 50000);
		accountService.ipGum(4444, 80000);
		accountService.ipGum(6666, 100000);		
		System.out.println("9.AccountService�� ���¹�ȣ,����ҵ� ���ڷ��ٲ� �������");
		accountService.chulGum(1111, 55000);
		accountService.chulGum(8888, 25000);
		accountService.chulGum(9999, 15000);
		System.out.println("10.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceAscending();
		System.out.println("11.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceDescending();
		/*
		 * 15.6666�������� �̸�,�ܰ�,���� ����(update)		  
		 */
		System.out.println("12.AccountService�� 6666�������� �̸�,�ܰ�,���� ��������");
		Account updateAccount=new Account(6666, "CHANGE", 2222, 3.3);
		accountService.updateAccount(updateAccount);
		/*
		 15.6666�������� �̸�,�ܰ�,���� ����(update)
		 */
		System.out.println("12-1.AccountService�� 6666�������� �̸�,�ܰ�,���� ��������");
		accountService.updateAccount(6666, "������!BANG", 44444, 9.9);
	}

}
