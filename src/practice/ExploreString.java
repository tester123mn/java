package practice;

public class ExploreString {

	public static void main(String[] args) {

		String s="software developer";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("so"));
		System.out.println(s.endsWith("loper"));
		System.out.println(s.contains("dev"));
		System.out.println(s.concat(" in google"));
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("d"));
		System.out.println(s.lastIndexOf("v"));
		String a="java";
		String b="Java";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(s.substring(9));
		System.out.println(s.substring(0,7));	
	}

}
