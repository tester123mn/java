package assignment;

public class PrintVowelOfGivenString {

	public static void main(String[] args) {

		String a = "mrUtunjay";
		for (int i = 0; i < a.length(); i++) {
			
			char b = a.charAt(i);
			if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
				System.out.println(b);
			} else if (b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')
				System.out.println(b);
		}
	}

}
