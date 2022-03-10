package com.day5.question5;

import java.util.Comparator;

public class ComparatorImpl implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StoreName n1=(StoreName)o1;
		StoreName n2=(StoreName)o2;
		return n1.name.compareTo(n2.name);
	}
}
