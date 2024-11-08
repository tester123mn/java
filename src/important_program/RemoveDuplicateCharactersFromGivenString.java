package important_program;

public class RemoveDuplicateCharactersFromGivenString {

	public static void main(String[] args) {

		String s = "aa bb cc dd ee";
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
