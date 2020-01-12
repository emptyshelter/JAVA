package com.itwill07.collection;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {
		
		
		AccountServiceArrayList accountServiceArrayList=new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList�� ��������߰�����");
		Account addAccount=new Account(1000, "��ҿ�",89000, 0.5);
		accountServiceArrayList.addAccount(addAccount);
		System.out.println("1.AccountServiceArrayList�� ������µ� �Ѱ��¼���ȯ����");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("�Ѱ��¼�[main]:"+accountCount);
		System.out.println("2.AccountServiceArrayList�� ������µ� ��ü�������");
		accountServiceArrayList.print();
		System.out.println("3.AccountServiceArrayList��������µ� ���ܰ� ��ȯ����");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("���ܰ�[main]:"+totBalance);
		System.out.println("4.AccountServiceArrayList�� ���¹�ȣ�ٲ� �����Ѱ���ȯ����");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("�����Ѱ�[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList�� �����ܰ��ٲ� �ܰ��̻��� ���µ��ȯ����[OPTION]");
		ArrayList findAccounts=
				accountServiceArrayList.findByBalance(50000);
		System.out.println(" ��ȯ���¼�:"+findAccounts.size());
		System.out.println(findAccounts);
		System.out.println("7.AccountServiceArrayList��������µ� �߿� �������̸��� AIM�� ���µ��ȯ����");
		System.out.println(accountServiceArrayList.findByName("AIM"));
		
		System.out.println("9.AccountServiceArrayList��1111������ 5000�� �������");
		try {
			accountServiceArrayList.chulGum(1111, 5000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			//JOptionPane.showMessageDialog(null,e.getMessage() ,"����", 1);
		}
		/*
		 8.6666������ 4000�� �Ա�����
		*/
		System.out.println(" 8.6666������ 4000�� �Ա�����");
		System.out.println(accountServiceArrayList.findByNo(6666));
		accountServiceArrayList.ipGum(6666, 4000);
		System.out.println(accountServiceArrayList.findByNo(6666));
		System.out.println("9.VIP����(�ܰ� 70000���̻�)�� ��ȯ����");
		System.out.println(accountServiceArrayList.findByBalance(70000));
		System.out.println("10.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();

		System.out.println(" 15-1.6666�������� �̸�,�ܰ�,���� ����(update)");
		System.out.println(accountServiceArrayList.findByNo(6666));
		accountServiceArrayList.updateAccount(6666,"XXX",30000,10);
		System.out.println(accountServiceArrayList.findByNo(6666));
		
		
		System.out.println(" 15-2.6666�������� �̸�,�ܰ�,���� ����(update)");
		Account updateAccount = new Account(6666, "YYY", 900000000, 0.4);
		accountServiceArrayList.updateAccount(updateAccount);
		System.out.println(accountServiceArrayList.findByNo(6666));
		
		System.out.println("-----------��ü���� ���-------------");		
		accountServiceArrayList.print();
		
	}

}













