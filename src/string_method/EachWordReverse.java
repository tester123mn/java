package string_method;

public class EachWordReverse {
	public static void main(String[] args) {
		String s = "smile and silent";
		s = s + " ";
		String s2 = "";
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				s2 = s2 + s.charAt(i);
			} else {
				for (int j = s2.length() - 1; j >= 0; j--) {
					res = res + s2.charAt(j);
				}
				res = res + " ";
				s2 = "";
			}

		}
		System.out.println(res);
	}

}
