package string_method;

public class ReversStringEachWord {

	public static void main(String[] args) {
		String s = "welcome to qsp maratha halli";
		String[] str = s.split(" ");
		String s1 = "";

		for (int i = 0; i < str.length; i++) {
			String b = str[i];
			for (int j = b.length() - 1; j >= 0; j--) {
				s1 = s1 + b.charAt(j);
			}
			s1 = s1 + " ";
		}
		System.out.println(s1);

	}
}