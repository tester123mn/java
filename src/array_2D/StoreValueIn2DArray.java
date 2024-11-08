package array_2D;

import java.util.Scanner;

public class StoreValueIn2DArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element " + (i + 1) + " row");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for (int[] b : a) {
			for (int c : b) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
