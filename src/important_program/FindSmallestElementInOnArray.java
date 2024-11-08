package important_program;

public class FindSmallestElementInOnArray {

	public static void main(String[] args) {


		int[] a = { 5, 4, 8, 9, 7, 3 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		System.out.println(min + " is the smallest number");
	}

}
