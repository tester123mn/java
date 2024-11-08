package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class AccessingElementInReverseOrder {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(12);
		al.add("java");
		al.add(12.89);
		al.add("manual");
		al.add(45);

		ListIterator li = al.listIterator(al.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
