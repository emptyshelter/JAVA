package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMain {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(34);
		intList.add(56);
		intList.add(89);
		intList.add(92);
		intList.add(67);
		intList.add(87);
		intList.add(12);
		
		List<Integer> intList2 = Arrays.asList(34,56,89,92,67,87,12);
		List<String> nameList = 
				Arrays.asList("梯團鷓","釭團鷓","夢團鷓","檜團鷓","梯團嬴");
		List<Account> accountList= 
				Arrays.asList(new Account(1111,"DIM",67000,2.3),
				new Account(2222, "AIM", 45000, 8.2),	
				new Account(3333, "SIM", 32000, 2.2),	
				new Account(4444, "DIM", 12500, 1.3),	
				new Account(5555, "FIM", 97000, 4.2),	
				new Account(6666, "QIM", 78000, 5.2),	
				new Account(7777, "WIM", 42000, 1.4),	
				new Account(8888, "EIM", 33000, 7.5),	
				new Account(9999, "RIM", 120000, 0.2));
				
		Collections.sort(intList);
		System.out.println("*************Integer sort*************");
		for (int i : intList) {
			System.out.print(i+",");
		}
		System.out.println();
		Collections.sort(intList2);
		Collections.sort(nameList);
		Collections.sort(accountList);
		System.out.println("*************Account sort[Comparable]*************");
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("*************Account sort[Comparator]*************");
		Collections.sort(accountList, new ComparatorBalanceAsc());
		Collections.reverse(intList);
		for (int i : intList) {
			System.out.print(i+",");
		}
		System.out.println();
		Collections.reverse(intList2);
		Collections.reverse(nameList);
		for (String name : nameList) {
			System.out.print(name+",");
		}
		System.out.println();
		Collections.reverse(accountList);
		

	}

}
