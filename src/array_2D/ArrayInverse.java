package array_2D;

public class ArrayInverse {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given metrix");
		for (int[] a1 : a) {
			for (int a2 : a1) {
				System.out.print(a2 + " ");
			}
			System.out.println();
		}
		System.out.println("Ivnerse matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
