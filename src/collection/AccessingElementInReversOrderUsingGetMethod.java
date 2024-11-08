package collection;

import java.util.ArrayList;

public class AccessingElementInReversOrderUsingGetMethod {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("java");
		al.add(12.89);
		al.add("manual");
		al.add(45);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
