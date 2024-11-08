package practice;

public class primeNumber50position {

	public static void main(String[] args) {

		int b = 0;
		int c=1;

		for (int i = 1; b < 50; i++) {
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
				System.out.println(c+"="+i);
				b++;
				c++;
			}
		}
	}

}
