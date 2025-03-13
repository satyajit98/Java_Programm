package com.collection.hashset;

import java.util.Comparator;

public class SortBasedOnPrice implements Comparator<Car> {
	
	public int compare(Car o1, Car o2) {
		return (int)(o1.getPrice()-o2.getPrice());
	}
}
