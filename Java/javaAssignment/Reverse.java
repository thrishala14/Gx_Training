package javaAssignment;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello good morning";
		String reverseStr = "";
		String[] s = str.split(" ");
		for(int i = 0; i < s.length ; i++) {
			reverseStr = s[i] + " " + reverseStr;
		}
		System.out.println(reverseStr);
	}

}
