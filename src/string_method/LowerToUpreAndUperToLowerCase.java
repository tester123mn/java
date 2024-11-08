package string_method;

public class LowerToUpreAndUperToLowerCase {

	public static void main(String[] args) {

		String s = "MrUtUnJaY PrAdHaN";
		String s1 = " ";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
				s1 = s1 + c;
			} else if (c >= 'a' && c <= 'z') {
				c = (char) (c - 32);
				s1 = s1 + c;
			} else
				s1 = s1 + " ";
		}
		System.out.println(s1);
	}
}
