package generic;

import java.util.Arrays;

public class ArraysMain {
	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		String[] strArray1= {"one","two","three"};
		String[] strArray2= {"one","two","three"};
		Account[] accounts= {
				new Account(1111,"DIM",67000,2.3),
				new Account(2222, "AIM", 45000, 8.2),	
				new Account(3333, "SIM", 32000, 2.2),	
				new Account(4444, "DIM", 12500, 1.3),	
				new Account(5555, "FIM", 97000, 4.2),	
				new Account(6666, "QIM", 78000, 5.2),	
				new Account(7777, "WIM", 42000, 1.4),	
				new Account(8888, "EIM", 33000, 7.5),	
				new Account(9999, "RIM", 120000, 0.2),	
		};
		System.out.println("1.배열의 내용비교");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		System.out.println("2.배열 원소채우기");
		Arrays.fill(intArray2, 7);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i]+",");
		}
		System.out.println();
		System.out.println("3.배열복사");
		int[] intArray3 = Arrays.copyOf(intArray1, 7);
		for (int i = 0; i < intArray3.length; i++) {
			System.out.print(intArray3[i]+",");
		}
		System.out.println("3.배열복사");
		System.out.println("-------원본------------");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		Account [] dest = new Account[accounts.length+1];
		System.arraycopy(accounts, 0, dest, 0, accounts.length);
		System.out.println("---------복사본---------");
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		System.out.println("4.----------sort[기본타입]-----------");
		int [] scoreArray = {90,67,88,23,56,12,34};
		/*
		 * enhanced for
		 */
		for (int score : scoreArray) {
			System.out.print(score+", ");
		}
		System.out.println();
		Arrays.sort(scoreArray);
		for (int score : scoreArray) {
			System.out.print(score+", ");
		}
		System.out.println();
		System.out.println("4.----------sort[String]-----------");
		String [] nameArray = {"홍민태","장민태","김민태","나민태","박민태"};
		for (String name : nameArray) {
			System.out.print(name+", ");
		}
		System.out.println();
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.print(name+", ");
		}
		System.out.println();
		System.out.println("4.----------sort[Integer]-----------");
		Integer [] wia= {new Integer(89),new Integer(45),
						 new Integer(23),new Integer(78),
						 new Integer(89),new Integer(12),
						 new Integer(0)};
		for (Integer inta : wia) {
			System.out.print(inta+ " ,");
		}
		System.out.println();
		Arrays.sort(wia);
		for (Integer inta : wia) {
			System.out.print(inta+ " ,");
		}
		System.out.println();
		System.out.println("4.----------sort[Object]-----------");
		Arrays.sort(accounts);
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("-------------ComparatorAsc--------------");
		Arrays.sort(accounts,new ComparatorBalanceAsc() );
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("-------------ComparatorDesc--------------");
		Arrays.sort(accounts,new ComparatorBalanceDesc() );
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("-----------ComparatorNameAsc------------");
		Arrays.sort(accounts,new ComparatorNameAsc());
		for (Account account : accounts) {
			account.print();
		}
		
	}

}
