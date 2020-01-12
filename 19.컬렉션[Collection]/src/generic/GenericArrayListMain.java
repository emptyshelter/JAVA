package generic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GenericArrayListMain {

	public static void main(String[] args) {
		System.out.println("-----------------Object[]----------------");
		Object[] anyTypeArray=new Object[5];
		Account acc1=new Account(1111, "BONG", 33000, 0.05);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "KING", 89000, 0.2);
		Account acc4=new Account(4444, "YONG", 12000, 0.5);
		Account acc5=new Account(5555, "SANG", 99000, 0.8);
		anyTypeArray[0]=acc1;
		anyTypeArray[1]=acc2;
		anyTypeArray[2]=acc3;
		anyTypeArray[3]=acc4;
		anyTypeArray[4]=acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount = (Account)anyTypeArray[i];
			tempAccount.print();
		}
		System.out.println("-----------------참조형----------------");
		ArrayList<Account> accountList=new ArrayList<Account>();
		System.out.println("#.size:"+accountList.size());
		System.out.println("*********** 1.add ***********");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#.size:"+accountList.size());
		accountList.add(3, new Account(3334, "ADD", 90000, 3.7));
		System.out.println("#.size:"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println("*********** 2.set ***********");
		accountList.set(3, new Account(3335, "SET", 99000, 3.3));
		System.out.println("#.size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 3.get **********");
		Account getAccount = accountList.get(1);
		getAccount.print();
		getAccount = accountList.get(4);
		getAccount.print();
		System.out.println("*********** 4.remove **********");
		Account removeAccount=
				(Account)accountList.remove(accountList.size()-1);
		System.out.println(">>삭제된Account:"+removeAccount);
		System.out.println("#.size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("**************전체출력*************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		System.out.println("***********계좌번호 3333번 계좌한개찾기*************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("******계좌주이름 KING 인 계좌여러개찾기*************");
		ArrayList <Account>findAccountList=new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				findAccountList.add(tempAccount);
			}
		}
		System.out.println(findAccountList);
		System.out.println("***********계좌번호 3333번 계좌한개삭제*************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getNo()==3333) {
				System.out.println("삭제전 size:"+accountList.size());
				Account removeAcc=accountList.remove(i);
				//boolean b=accountList.remove(tempAccount);
				removeAcc.print();
				System.out.println("삭제후 size:"+accountList.size());
				break;
			}
		}
		System.out.println("*******계좌주이름 KING 인 계좌여러개삭제[Quiz]**********");
		System.out.println("************** 5.clear ***********");
		//accountList.clear();
		System.out.println("ArrayList size:"+accountList.size());
		System.out.println("************** 6.isEmpty ***********");
		System.out.println(accountList.isEmpty());
		System.out.println("******************Iteration*****************");
		Iterator accIter = accountList.iterator();
		System.out.println(accIter);
		while (accIter.hasNext()) {
			Account tempAccount=(Account)accIter.next();
			tempAccount.print();
		}
		System.out.println("******************Iteration(for)*****************");
		for (Account account : findAccountList) {
			account.print();
		}
		
		System.out.println("-----------------기본형[Wrapper,String]----------------");
		ArrayList <Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(new Integer(90));
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(56);
		scoreList.add(34);
		scoreList.add(12);
		scoreList.add(99);
		scoreList.add(62);
		scoreList.add(43);
		scoreList.add(99);
		System.out.println("---add----");
		System.out.println(scoreList);
		int intGetScore = scoreList.get(0);
		System.out.println("---get---:"+intGetScore);
		int getScore2 = (Integer)scoreList.get(1);
		System.out.println("---get---:"+getScore2);
		scoreList.set(3, 100);
		System.out.println("---set---");
		System.out.println(scoreList);
		int removeScore =
				(Integer)scoreList.remove(scoreList.size()-1);
		System.out.println("---remove(int index)--:"+removeScore);
		System.out.println(scoreList);
		/*
		Removes the first occurrence of the specified element from this list
		 */
		 boolean b = scoreList.remove(new Integer(90));
		System.out.println("---remove(Object o)--:"+b);
		System.out.println(scoreList);
		System.out.println("------------전체출력-----------");
		for (int i = 0; i < scoreList.size(); i++) {
			int ti=(Integer)scoreList.get(i);
			System.out.print(ti+" ");
		}
		System.out.println();
		System.out.println("------------전체출력[Iterator]-----------");
		Iterator <Integer>scoreIter = scoreList.iterator();
		while (scoreIter.hasNext()) {
			int score=scoreIter.next();
			System.out.print(score+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("-----------------String------------------");
		ArrayList <String> nameList=new ArrayList<String>();
		nameList.add("KIM");
		nameList.add("SIM");
		nameList.add("CIM");
		nameList.add("VIM");
		String str=new String("UIM");
		nameList.add(str);
		nameList.add("TIM");
		nameList.add("IIM");
		nameList.add("BIM");
		nameList.add("KIM");
		nameList.add("KIM");
		System.out.println(nameList.size());
		System.out.println(nameList);
		nameList.add(0, "KKK");
		System.out.println("----add----:"+nameList);
		String removeName = nameList.remove(0);
		System.out.println("----remove(int index)----:"+removeName);
		System.out.println(nameList);
		System.out.println("----remove(Object o)----");
		boolean isRemove=nameList.remove(new String("KIM"));
		System.out.println(nameList);
		System.out.println("---------전체출력----------------");
		for (int i = 0; i < nameList.size(); i++) {
			String name=nameList.get(i);
			System.out.print(name+" , ");
		}
		System.out.println();
		System.out.println("---------전체출력[Iterator]----------------");
		Iterator <String> nameIterator = nameList.iterator();
		while (nameIterator.hasNext()) {
			String name =  nameIterator.next();
			System.out.print(name+" ");
		}
		System.out.println();
		
		
		
	}

}









