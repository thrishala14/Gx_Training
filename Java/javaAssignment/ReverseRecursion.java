package javaAssignment;

public class ReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghij";
		reversal(str);

	}

	private static void reversal(String str) {
		// TODO Auto-generated method stub
		if ((str==null)||(str.length() <= 1))
	           System.out.println(str);
	        else
	        {
	            System.out.print(str.charAt(str.length()-1));
	            reversal(str.substring(0,str.length()-1));
	        }
	}

}
