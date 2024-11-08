package collection;

import java.util.ArrayList;

public class ExampleForAdd_AddAll {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList a2 = new ArrayList();
		a2.add(50);
		//a2.add(3, al);
		a2.addAll(al);
		a2.add(1, 60);
		System.out.println(al);
		System.out.println(a2);

	}

}
