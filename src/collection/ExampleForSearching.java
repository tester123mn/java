package collection;

import java.util.ArrayList;

public class ExampleForSearching {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("java");
		al.add("manual");
		al.add("python");
		al.add("sql");
		al.add("api");
		al.add("selenium");

		System.out.println(al.contains("jsp"));
		System.out.println(al.contains("manual"));
		System.out.println(al.indexOf("java"));
		System.out.println(al.contains("c#"));

		ArrayList al1 = new ArrayList();
		System.out.println(al1.contains(al));
		al1.addAll(al);
		System.out.println(al1.containsAll(al));
	}

}
