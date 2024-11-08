package assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153, a = 0, r, c;
		c = n;
		while (n > 0) {
			r = n % 10;
			a = a + (r * r * r);
			n = n / 10;
		}
		if (c == a)
			System.out.println("it is a armstrong");
		else
			System.out.println("it is not a armstrong");
	}

}
