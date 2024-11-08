package practice;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("Enter your number");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			int count = 0;
			if (i == 1)
				count++;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

}
