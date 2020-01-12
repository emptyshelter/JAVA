import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import generic.Account;

public class ArrayListMain {

	public static void main(String[] args) {
		System.out.println("---------------------Object[]----------------------");
		Object [] anyTypeArray = new Object[5];
		Account acc1 = new Account(1111, "KIM", 56900, 1.1);
		Account acc2 = new Account(2222, "AIM", 19000, 0.7);
		Account acc3 = new Account(3333, "HIM", 71200, 5.5);
		Account acc4 = new Account(4444, "CIM", 14500, 4.2);
		Account acc5 = new Account(5555, "KIM", 45700, 0.1);
		anyTypeArray [0] = acc1;
		anyTypeArray [1] = acc2;
		anyTypeArray [2] = acc3;
		anyTypeArray [3] = acc4;
		anyTypeArray [4] = acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount = (Account)anyTypeArray[i];
			tempAccount.print();
		}
		System.out.println("---------------------참조형----------------------");
		ArrayList accountList = new ArrayList();
		System.out.println("#.size:"+accountList.size());
		System.out.println("***********1.ADD***************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(3, new Account(3334,"ADD",90000,0.1));
		System.out.println("#.size :"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println("***********2.SET***************");
		accountList.set(3, new Account(3335,"SET",99000,0.7));
		System.out.println("#.size :"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println("***********3.GET***************");
		Object getObject = accountList.get(1);
		System.out.println(getObject);
		Account getAccount = (Account)getObject;
		getAccount.print();
		getAccount.print();
		getAccount= (Account)accountList.get(4);
		getAccount.print();
		System.out.println("***********3.REMOVE***************");
		Account removeAccount = 
				(Account)accountList.remove(accountList.size()-1);
		System.out.println(">>삭제된 Account: "+removeAccount);
		System.out.println("#.size :"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println("***********전체출력***************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println("-------------전체출력(enhanced for)---------------");
		for (Object account : accountList) {
			Account tempAccount = (Account)account;
			tempAccount.print();
		}
		System.out.println("***********계좌번호3333인 계좌 찾기***************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("***********계좌주이름이 KIM인 계좌여러개찾기***************");
		ArrayList findAccountList= new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getOwner().equals("KIM")) {
				findAccountList.add(tempAccount);
			}
		}
		System.out.println(findAccountList);
		System.out.println("***********계좌번호3333번 계좌한개삭제***************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getNo()==3333) {
				System.out.println("삭제전 size:" + accountList.size());
				Account removeAcc = (Account)accountList.remove(i);
				System.out.println("삭제후 size:" + accountList.size());
				break;
			}
		}
		System.out.println("***********계좌주이름이 KIM인 계좌여러개삭제***************");
		ArrayList findByName = new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getOwner().equals("KIM")) {
				
			}
		}
		System.out.println("***********5.clear***************");
		accountList.clear();
		System.out.println("#.size :"+accountList.size());
		System.out.println("***********6.isEmpty***************");
		System.out.println("accountList.isEmpty():"+ accountList.isEmpty());
		System.out.println("***********Iteration***************");
		Iterator accIter = accountList.iterator();
		System.out.println(accIter);
		while (accIter.hasNext()) {
			Account tempAccount=(Account)accIter.next();
			tempAccount.print();
		}
		
		
		System.out.println("--------------기본형[Wrapper,String)-------------");
		ArrayList scoreList = new ArrayList();
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(90));
		scoreList.add(34);
		scoreList.add(21);
		scoreList.add(87);
		scoreList.add(97);
		scoreList.add(99);
		scoreList.add(91);
		scoreList.add(94);
		scoreList.add(39);
		scoreList.add(99);
		System.out.println("---add----");
		System.out.println(scoreList);
		Object o = scoreList.get(0);
		Integer getScore=(Integer)o;
		int intGetScore = getScore.intValue();
		System.out.println("---get:"+intGetScore);
		int getScore2 = (Integer)scoreList.get(1);
		System.out.println("---get:"+getScore2);
		scoreList.set(3, 100);
		System.out.println("---set");
		System.out.println(scoreList);
		int removeScore =
				(Integer)scoreList.remove(scoreList.size()-1);
		System.out.println("---remove:"+removeScore);
		System.out.println(scoreList);
		/*
		 * Removes the first occurrence of the specified element from this list
		 */
		boolean b = scoreList.remove(new Integer(90));
		System.out.println("---remove(Object o )--:"+b);
		System.out.println(scoreList);
		System.out.println("-------------전체출력---------------");
		for (int i = 0; i < scoreList.size(); i++) {
			int ti = (Integer)scoreList.get(i);
			System.out.print(ti+" ");
		}
		
		System.out.println();
		System.out.println("-------------전체출력[Iterator]---------------");
		Iterator scoreIter = scoreList.iterator();
		while (scoreIter.hasNext()) {
			Integer tempScore = (Integer) scoreIter.next();
			int score = tempScore.intValue();
			System.out.print(score + " ");
		}
		System.out.println();
		System.out.println("-----------Sting-----------");
		ArrayList nameList = new ArrayList();
		nameList.add("KIM");
		nameList.add("AIM");
		nameList.add("BIM");
		nameList.add("CIM");
		String str = new String("UIM");
		nameList.add(str);
		nameList.add("DIM");
		nameList.add("EIM");
		nameList.add("FIM");
		nameList.add("GIM");
		nameList.add("HIM");
		System.out.println(nameList.size());
		nameList.add(0, "KKK");
		System.out.println("---add----:"+nameList);
		String removeName= (String)nameList.remove(0);
		System.out.println("---remove (int index)----:"+removeName);
		System.out.println(nameList);
		System.out.println("---remove(Object o )---");
		boolean isRemove = nameList.remove(new String("KIM"));
		System.out.println(nameList);
		System.out.println("-------------전체출력---------------");
		for (int i = 0; i < nameList.size(); i++) {
			String name = (String)nameList.get(i);
			System.out.print(name+" , ");
		}

		System.out.println();
		System.out.println("-------------전체출력[Iterator]---------------");
		Iterator nameIterator = nameList.iterator();
		while (nameIterator.hasNext()) {
			String name = (String) nameIterator.next();
			System.out.print(name+ " ");
		}
		System.out.println();
		
	}
}
