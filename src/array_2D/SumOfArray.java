package array_2D;

public class SumOfArray {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 3 } };
		int[][] b = { { 8, 1, 3 }, { 5, 3, 3 }, { 1, 1, 4 } };
		
		System.out.println("Given metrix");
		for (int[] a1 : a) {
			for (int a2 : a1) {
				System.out.print(a2 + " ");
			}
			System.out.println();
		}
		System.out.println("==================");

		for (int[] b1 : b) {
			for (int b2 : b1) {
				System.out.print(b2 + " ");
			}
			System.out.println();
		}
		
		System.out.println("total matrix");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
