package javaAssignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdcbaaa";
		StringBuilder s2 = new StringBuilder("");
		s2.append(s1);
		s2.reverse();
		String s3 = s2.toString();
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("The strings are palindrome!");
		}
		else {
			System.out.println("The strings are not palindrome!");
		}
	}
}
