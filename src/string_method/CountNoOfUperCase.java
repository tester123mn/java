package string_method;

public class CountNoOfUperCase {

	public static void main(String[] args) {

		String s = "MrUtUnJaY PrAdHaN";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
