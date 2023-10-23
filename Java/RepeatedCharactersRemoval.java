package practice23rd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedCharactersRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		unrepeated(str);
		sc.close();
	}

	private static void unrepeated(String str) {
		String newStr = "";
		List<Character> chars = new ArrayList<Character>();
		for(int i = 0; i< str.length(); i++) {
			if(!chars.contains(str.charAt(i))) {
				newStr += str.charAt(i);
				chars.add(str.charAt(i));
			}
		}
		System.out.println(newStr);
		
	}

}
