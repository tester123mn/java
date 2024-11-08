package collection;

import java.util.ArrayList;

public class ExampleForAccessing {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("java");
		al.add(12.89);
		al.add("manual");
		al.add(45);
		System.out.println(al);

		for (Object o : al) {
			if (o instanceof String)
				System.out.println(o);
		}

	}

}
