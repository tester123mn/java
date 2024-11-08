package assignment; 

public class LargestStringinString {

	public static void main(String[] args) {

		String a = "java is a high level programming language";
		String[] b = a.split(" ");
		String ls = "";
		for (String c : b) {
			if ( ls.length()< c.length() ) {
				ls = c;
			}
		}
		System.out.println(ls);
	}

}
