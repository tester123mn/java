package practice;

public class ExploreStringBuffer {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("java is easy");

		s.append("i think");
		System.out.println(s);
		s.insert(12, " ");
		System.out.println(s);
		s.delete(5, 13);
		System.out.println(s);
		char c = s.charAt(2);
		System.out.println(c);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.reverse();
		System.out.println(s);

	}

}
