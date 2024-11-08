package practice;

import java.util.*;


public class RemoveDuplicateFromGivenArray {

	public static void main(String[] args) {

		int[] a = { 1, 2,  4,  6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		HashSet hs = new HashSet();

		for (int i : a) {
			//if (hs.add(i))
				//System.out.println(i);
			hs.add(i);
		}
		ArrayList al=new ArrayList(hs);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
