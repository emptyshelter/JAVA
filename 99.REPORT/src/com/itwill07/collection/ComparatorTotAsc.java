package com.itwill07.collection;

import java.util.Comparator;

public class ComparatorTotAsc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getTot()-o2.getTot();
	}


}
