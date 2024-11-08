package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Sort {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		//hs.add(2.38);
		//hs.add("hello");
		//hs.add(null);
		hs.add(52);
		hs.add(78);
		hs.add(40);
		hs.add(756);
		hs.add(4);
		System.out.println(hs);
		
		//convert set to int
		ArrayList al=new ArrayList(hs);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(al.get(1));
	}

}
