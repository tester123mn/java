package collection;

import java.util.ArrayList;

public class ExampleForRemoving {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("java");
		al.add("manual");
		al.add("python");
		al.add("slq");
		al.add("selenium");
		al.add("api");
		al.add("python");
		al.remove("python");
		System.out.println(al);
		System.out.println(al.remove(3));
		System.out.println(al);

		System.out.println("==================================");
		ArrayList al1 = new ArrayList();
		al1.add("manual");
		al1.add("sql");
		al1.add("j2ee");
		al1.add("spring");
		al1.add("jdbc");
		System.out.println(al);
		System.out.println(al1);
		al1.removeAll(al);
		System.out.println(al);
		System.out.println(al1);
		al1.retainAll(al);
		System.out.println(al);
		System.out.println(al1);
		al.clear();
		System.out.println(al);
	}

}
