package collection;

public class LinkedList {

	public static void main(String[] args) {

		java.util.LinkedList l = new java.util.LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.add(0, 100);// list
		l.addFirst(100);
		System.out.println(l);

		l.removeLast();
		System.out.println(l);

		l.removeFirst();
		System.out.println(l);

		System.out.println(l.getFirst());
		System.out.println(l.getLast());

	}

}
