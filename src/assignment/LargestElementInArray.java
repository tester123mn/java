package assignment;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] a = { 4, 5, 8, 7, 2, 1, 3, 9 };
		int b = a[0];

		for (int i = 0; i < a.length; i++) {
			if (b < a[i]) {
				b = a[i];
			}
		}
		System.out.println(b);
	}

}
