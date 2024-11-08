package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondMaximumInArray {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		hs.add(9);
		hs.add(8);
		hs.add(9);

		ArrayList al = new ArrayList(hs);
		
		Collections.sort(al);
		Collections.reverse(al);

		System.out.println(al.get(1));

	}

}
