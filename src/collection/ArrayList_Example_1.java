package collection;

import java.util.ArrayList;

public class ArrayList_Example_1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(123);
		al.add(12.38);
		al.add("hello");
		al.add('c');
		al.add(true);
		al.add(null);
		al.add(123);
		System.out.println(al);
	}

}
