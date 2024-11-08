package array;


public class PrimeNumberFromAnArray {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int j = 0; j < a.length; j++) {
			prime(a[j]);
		}
	}

	public static void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n);
		}
	}
}
