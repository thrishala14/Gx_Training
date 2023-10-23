package javaAssignment;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello world good morning");
		StringBuffer sb1 = new StringBuffer();
		for(int i = 0; i<sb.length();i++) {
			char c = sb.charAt(i);
			if(c != ' ') {
				sb1.append(c);
			}
		}
		System.out.println(sb1);
	}

}
