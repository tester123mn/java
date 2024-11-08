package practice;

public class ReversEachString {

	public static void main(String[] args) {

		String s = "you are my love";
		String[] s1 = s.split(" ");
		String s2 = "";
		for (int i = 0; i < s1.length; i++) {
			String b = s1[i];
			for (int j = b.length() - 1; j >= 0; j--) {
				s2 = s2 + b.charAt(j);
			}
			s2 = s2 + " ";
		}
		System.out.println(s2);
	}

}
