package collection;

import java.util.LinkedHashMap;

public class LinkedHashSet {

	public static void main(String[] args) {

		java.util.LinkedHashSet ls = new java.util.LinkedHashSet();

		ls.add(10);
		ls.add('c');
		ls.add(true);
		ls.add("hello");
		ls.add(null);
		System.out.println(ls);
	}

}
