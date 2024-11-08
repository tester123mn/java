package collection;

public class HashSet {

	public static void main(String[] args) {

		java.util.HashSet hs = new java.util.HashSet();

		hs.add(10);
		System.out.println(hs.add("hello"));
		hs.add('c');
		hs.add(true);
		System.out.println(hs.add("hello"));
		hs.add(null);
		System.out.println(hs);
	}

}
