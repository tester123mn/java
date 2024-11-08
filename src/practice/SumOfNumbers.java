package practice;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int c = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a nember");
		int a = s.nextInt();
		while (a != 0) {
			c = a % 10;
			sum = sum + c;
			a = a / 10;
		}
		System.out.println(sum);
	}

}
