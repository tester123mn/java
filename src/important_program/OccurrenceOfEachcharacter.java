package important_program;

public class OccurrenceOfEachcharacter {

	public static void main(String[] args) {

		String s = "AA BB CC DD";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 1;
			if (s1.indexOf(ch) == -1) {
				for (int j = i + 1; j < s.length(); j++) {
					char ch1 = s.charAt(j);
					if (ch == ch1) {
						count++;
					}
				}
				s1 = s1 + ch;
				System.out.println(ch + "=" + count);
			}

		}
	}

}

