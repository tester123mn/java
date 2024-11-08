package important_program;

public class FindSecondLargestElementInAnArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 10,9, };
		int max = a[0];
		int smax = a[1];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				smax = max;
				max = a[i];
			} else if (smax < a[i]) {
				smax = a[i];
			}
		}
		System.out.println(smax);
	}

}
