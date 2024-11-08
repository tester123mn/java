package practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your nember");
		int a = s.nextInt();
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if (a%i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("it is a prime number");
		}
		else
			System.out.println("it is not a prime number");
		
	}

}
