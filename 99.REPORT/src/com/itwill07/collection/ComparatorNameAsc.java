package com.itwill07.collection;

import java.util.Comparator;

public class ComparatorNameAsc implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o1.getOwner().compareTo(o2.getOwner());
	}
}
