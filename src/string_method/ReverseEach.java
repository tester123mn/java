package string_method;

public class ReverseEach {
	public static void main(String[] args) {
		String s = "silent and smile";
		String s1[] = s.split(" ");
		String res = "";

		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				res = res + s2.charAt(j);
			}
			res = res + " ";
		}
		System.out.println(res);
	}

}
