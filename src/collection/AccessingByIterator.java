package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessingByIterator {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("java");
		al.add(12.89);
		al.add("manual");
		al.add(45);

		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}

}
