package important_program;

public class PrimeNumberInAmArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int j = 0; j < a.length; j++) {
			prime(a[j]);
		}
	}

	public static void prime(int n) {
		int count = 0;
		if (n==1)count++;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n);
		}
	}
}
