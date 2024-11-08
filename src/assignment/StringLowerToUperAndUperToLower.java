package assignment;

public class StringLowerToUperAndUperToLower {

	public static void main(String[] args) {

		String a = "MrUtUnJaY pRaDhAn";
		String o = "";
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			if (b >= 'a' && b <= 'z') {
				b = (char) (b - 32);
				o = o + b;
			} else if (b >= 'A' && b <= 'Z') {
				b = (char) (b + 32);
				o = o + b;
			} else
				o = o + " ";
		}
		System.out.println(o);

	}

}
