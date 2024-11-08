package collection;

public class TreeSet {

	public static void main(String[] args) {

		java.util.TreeSet ts = new java.util.TreeSet();

		ts.add("java");
		ts.add("python");
		ts.add("c");
		ts.add("c++");
		ts.add("manual");
		ts.add("api");
		ts.add("java");
		ts.add(10);
		ts.add(90);
		ts.add(80);
		ts.add(40);
		ts.add(60);
		System.out.println(ts);

		//for descending
		System.out.println(ts.descendingSet());
		
	}

}
