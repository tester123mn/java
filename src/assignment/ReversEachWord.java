package assignment;

public class ReversEachWord {

	public static void main(String[] args) {

		String a = "welcome to qsp";
		String[] b = a.split(" ");
		String c = "";

		for (int i = 0; i < b.length; i++) {
			String d = b[i];
			for (int j = d.length() - 1; j >= 0; j--) {
				c = c + d.charAt(j);
			}
			c = c + " ";
		}
		System.out.println(c);
	}

}
