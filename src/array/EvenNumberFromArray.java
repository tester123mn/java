package array;

import java.util.Scanner;

public class EvenNumberFromArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size");
		int[] a = new int[s.nextInt()];
		
		System.out.println("Enter element");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

}
