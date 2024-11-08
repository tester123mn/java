package array;

public class ArrayReversOrder {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = new int[a.length];
		int count = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			b[count++] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
