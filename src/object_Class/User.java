package object_Class;

public class User {
	public static void main(String[] args) {
		Student s = new Student("shiva", 30, 70);
		Student s1 = new Student("shiva", 30, 70);// "mn",40,80
		Student s2 = new Student("raja", 50, 90);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashcode() == s1.hashcode());

	}

}
