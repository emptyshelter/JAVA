package com.itwill07.collection;

import java.util.Comparator;

public class ComparatorBalanceDesc implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o2.getBalance()-o1.getBalance();
	}

}
