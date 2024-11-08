package object_Class;

public class Details {

	public static void main(String[] args) {

		Bus b = new Bus("srs", "jagu", 20000, "odisha", "bengalur");
		Bus b1 = new Bus("srs", "jagu", 20000, "odisha", "bengalur");// "srs","bali",60000,"odisha","andrha"
		Bus b2 = new Bus("shree", "ana", 50000, "delhi", "odisha");
		System.out.println(b);
		System.out.println("========================");
		System.out.println(b1);
		System.out.println("========================");
		System.out.println(b2);
		System.out.println("========================");
		System.out.println(b == b1);
		System.out.println(b.equals(b1));
		System.out.println(b.hashcode() == b1.hashcode());
	}

}
