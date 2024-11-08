package practice;

public class PalindromInteger {

	public static void main(String[] args) {
		int x = 121;
		if(isPalindrome(x))
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");

	}

	public static boolean isPalindrome(int x) {
		int d = 0;
		int b=x;
		while (x > 0) {
			int a = x % 10;
			d = d*10+a;
			x = x / 10;
		}
		System.out.println(d);
		if (b == d) {
			return true;
		} else
			return false;
	}

}
