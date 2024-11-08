package array;

import java.util.Scanner;

public class SumOfElement {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size");
		int[] a = new int[s.nextInt()];

		System.out.println("Enter element");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
