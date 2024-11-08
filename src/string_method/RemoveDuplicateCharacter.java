package string_method;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String s = "mrutunjay";
		String a = "";

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			if (a.indexOf(ch1) == -1) {
				a = a + ch1;
			}
		}
		System.out.print(a);
	}
}
