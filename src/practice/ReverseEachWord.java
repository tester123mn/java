package practice;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "java is easy";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}

}
