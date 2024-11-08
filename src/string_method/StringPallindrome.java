package string_method;

public class StringPallindrome {

	public static void main(String[] args) {

		String s="madam";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
			if(s.equals(s1)) {
				System.out.println("it is a pallindrome");
			}else
				System.out.println("it is not a pallindrome");
		}
	}


