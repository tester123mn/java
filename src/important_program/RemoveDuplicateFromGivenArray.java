package important_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicateFromGivenArray {

	public static void main(String[] args) {

		int[] a = { 5, 6, 8, 8, 9, 10, 10, 2, 1, 2 };
		HashSet hs = new HashSet();

		for (int i : a) {
			//hs.add(i);
			if (hs.add(i)) {
				System.out.println(i);
			}

		}
		 //System.out.println(hs);

		ArrayList al=new ArrayList(hs);
	//	Collections.sort(al);
		System.out.println(al);

	}

}
