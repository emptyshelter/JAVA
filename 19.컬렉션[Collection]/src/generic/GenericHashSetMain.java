package generic;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericHashSetMain {
	public static void main(String[] args) {
		Account acc1 = new Account(1111, "KIM", 56900, 1.1);
		Account acc2 = new Account(2222, "AIM", 19000, 0.7);
		Account acc3 = new Account(3333, "HIM", 71200, 5.5);
		Account acc4 = new Account(4444, "CIM", 14500, 4.2);
		Account acc5 = new Account(5555, "KIM", 45700, 0.1);
		HashSet <Account>accSet = new HashSet<Account>();
		System.out.println("#.set size:"+accSet.size());
		System.out.println("************1.add**************");
		accSet.add(acc1);
		accSet.add(acc2);
		accSet.add(acc3);
		accSet.add(acc4);
		accSet.add(acc5);
		System.out.println("#.set size:"+accSet.size());
		System.out.println(accSet);
//		boolean isAdd = accSet.add(acc5);
		boolean isAdd = accSet.add(new Account(1111,null,33,0.1));
		System.out.println("************추가여부"+isAdd+"**************");
		System.out.println("#.set size:"+accSet.size());
		System.out.println(accSet);
		System.out.println("************2.remove**************");
		System.out.println(acc5+"와 동일한 객체삭제");
		boolean isRemove = accSet.remove(acc5);
//		Account newAccount = new Account(5555, "KIM", 45700, 0.1);
//		System.out.println(newAccount+"와 동일한 객체삭제");
//		boolean isRemove = 
//				accSet.remove(new Account(5555, "KIM", 45700, 0.1));
		System.out.println("삭제여부:"+isRemove);
		System.out.println("#.set size:"+accSet.size());
		System.out.println(accSet);
		System.out.println("************3.contains**************");
		if (!accSet.contains(acc5)) {
			System.out.println(accSet.hashCode()+"객체 존재 안함");
		}
		System.out.println("************4.clear**************");
//		accSet.clear();
		System.out.println("#.set size:"+accSet.size());
		System.out.println("************5.isEmpty**************");
		accSet.isEmpty();
		System.out.println("accSet.isEmpty(): "+accSet.isEmpty());
		System.out.println("************Iteration**************");
		Iterator <Account>accIter = accSet.iterator();
		System.out.println(accIter);
		while (accIter.hasNext()) {
			Account tempAccount = (Account)accIter.next();
			tempAccount.print();
		}
		System.out.println("************Wrapper,String**************");
		HashSet <Integer>lottoSet = new HashSet<Integer>();
		System.out.println("------add------"+lottoSet.size());
		lottoSet.add(23);
		lottoSet.add(21);
		lottoSet.add(2);
		lottoSet.add(6);
		lottoSet.add(40);
		System.out.println("------add------"+lottoSet.size());
		isAdd = lottoSet.add(40);
		System.out.println();
		System.out.println("------add---:isAdd-->"+isAdd);
		System.out.println(lottoSet);
		lottoSet.remove(new Integer(2));
		System.out.println(lottoSet);
		System.out.println("----------Iteration---------------");
		Iterator <Integer>lottoIterator = lottoSet.iterator();
		while (lottoIterator.hasNext()) {
			int no = lottoIterator.next();
			System.out.print(no + " ");
		}
		System.out.println();
		System.out.println("-----------String-----------");
		Set <String> nameSet = new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println("add"+nameSet);
		isAdd= nameSet.add(new String("KIM"));
		System.out.println("add:isAdd("+isAdd+")"+nameSet);
		if (nameSet.contains("JIM")) {
			System.out.println("JIM문자열을 가진 String객체가 존재합니다");
		}
		System.out.println("----------Iteration---------------");
		Iterator<String>nameIter= nameSet.iterator();
		while (nameIter.hasNext()) {
			String name = (String) nameIter.next();
			System.out.print(name+" ,");
		}

	}

}
