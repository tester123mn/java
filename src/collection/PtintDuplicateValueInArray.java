package collection;

import java.util.HashSet;

public class PtintDuplicateValueInArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9,1,2,3};
		HashSet hs = new HashSet();

		for (int i : a) {
			if (!hs.add(i))
				System.out.println(i);
		}
	}

}
