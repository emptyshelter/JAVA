package com.itwill06.service.account;



public class AccountServiceReturnMain {

	public static void main(String[] args) {
		AccountServiceReturn accountService = new AccountServiceReturn();
		System.out.println("0.AccountService��ü�� ������� �߰�����");
		Account newAccount = new Account(9090, "����ź",8989, 0.8);
		accountService.addAccount(newAccount);
		accountService.print();
		System.out.println("===============================================");
		newAccount = new Account(7878, "CHIL",8000, 0.3);
		accountService.addAccount(newAccount);
		accountService.print();
		System.out.println("===============================================");
		System.out.println("0.AccountService��ü�� ���¹�ȣ�ٲ� ���»�������");
		accountService.deleteAccount(7878);
		accountService.print();
		
		System.out.println("1.AccountService��ü�� ������� �Ѱ��¼��� ��ȯ����");
		int accountNo = accountService.getAccountNumber();
		System.out.println(">>>> �Ѱ��¼�:" + accountNo);
		System.out.println("2.AccountService��ü�� ������µ� ��ü�������");
		accountService.print();
		System.out.println("3.AccountService��ü�� ������µ� ���ܰ� ��ȯ����");
		int tot = accountService.getAccountTotalBalance();
		System.out.println(">>>> ���ܰ�:" + tot);
		System.out.println("4.AccountService��ü�� ���¹�ȣ(3333��)�����ڷ� �־��ٲ� �����Ѱ����������� ��ȯ����");
		Account findAccount = accountService.findByNo(3333);
		System.out.println(findAccount);
		findAccount = accountService.findByNo(32423);
		if(findAccount!=null) {
			System.out.println(findAccount);
		}else {
			System.out.println("���¾���!!!");
		}
		System.out.println("5.AccountService��ü�� �����ܰ�(70000��)�� ���ڷ��ٲ� �ܰ��̻��� ���°�ü�迭 ����������ȯ����");
		Account[] findAccounts = accountService.findByBalance(70000);

		for (int i = 0; i < findAccounts.length; i++) {
			System.out.println(findAccounts[i]);
		}

		System.out.println("6.AccountService��ü��  ��������(5.0)�� ���ڷ��ٲ� �����̻��� ���°�ü�迭 �������� ��ȯ����");
		Account[] findAccounts2 = accountService.findByIyul(5.0);
		for (int i = 0; i < findAccounts2.length; i++) {
			System.out.println(findAccounts2[i]);
		}
		System.out.println("7.AccountService��ü��  �������̸�(AIM)�� ���ڷ��ٲ� ���°�ü�迭 �������� ��ȯ����");
		Account[] findAccounts3 = accountService.findByOwner("AIM");
		for (int i = 0; i < findAccounts3.length; i++) {
			System.out.println(findAccounts3[i]);
		}
		System.out.println("8.AccountService��ü�� ���¹�ȣ(6666��)�� �Ա��ҵ�(4000��)�ٲ� �Ա�����");
		accountService.ipGum(6666, 4000);
		System.out.println("9.AccountService��ü�� ���¹�ȣ(1111��)�� ����ҵ�(500��)�ٲ� �������");
		accountService.chulGum(1111, 500);
		System.out.println("10.AccountService��ü�� ���¸� �ܰ������ ����������������");
		accountService.sortByBalance(AccountServiceReturn.ASCENDING);
		accountService.print();
		System.out.println("11.AccountService��ü�� ���¸� �ܰ������ ����������������");
		accountService.sortByBalance(AccountServiceReturn.DESCENDING);
		accountService.print();
		System.out.println("13.AccountService��ü�� ���¸� �������̸���(������)���� ������������");
		accountService.sorByOwner(AccountServiceReturn.ASCENDING);
		accountService.print();
		System.out.println("14.AccountService��ü�� 6666�������� �ܰ�(500),�̸�(�ٺ�),����(3.2) ����");
		Account updateAccount=new Account(6666, "�ٺ�", 500, 3.2);
		accountService.updateAccount(updateAccount);
		accountService.print();
		
	}

}
