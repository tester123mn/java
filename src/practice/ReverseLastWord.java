package practice;

public class ReverseLastWord {

	public static void main(String[] args) {
		String s = "you are my evol";
		String[] s1 = s.split(" ");
		String b = s1[s1.length - 1];
		String store = "";
		String d = "";

		for (int i = b.length() - 1; i >= 0; i--) {
			store = store + b.charAt(i);
		}

		for (int j = 0; j < s1.length - 1; j++) {
			d = d + s1[j] + " ";
		}
		System.out.println(d + " " + store);
	}
}
