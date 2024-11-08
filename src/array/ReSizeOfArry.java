package array;

import java.util.Scanner;

public class ReSizeOfArry {
	static int[] a;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		a = new int[s.nextInt()];
		System.out.println("Enter element");
		for (int i = 0; i <= a.length; i++) {

			if (i == a.length) {
				increase();
			}

			a[i] = s.nextInt();
			System.out.println("do u want continue..........");
			if (s.next().equals("no"))
				break;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

	public static void increase() {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a = b;
	}
}
