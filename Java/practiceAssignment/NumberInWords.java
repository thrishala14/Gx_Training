package practiceAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  11. Write a program to display a number in words. 
 */


public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words");
		String s = sc.nextLine();
		String num = "";
		for(int i = 0 ; i<s.length();i++) {
			isNum(s.charAt(i));
		}

		System.out.println(num);
		sc.close();
		
	}

	private static void isNum(char c) {
		// TODO Auto-generated method stub
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('0');
		al.add('1');
		al.add('2');
		al.add('3');
		al.add('4');
		al.add('5');
		al.add('6');
		al.add('7');
		al.add('8');
		al.add('9');
		if(al.contains(c)) {
			System.out.print(c +"");
		}
		
	}

}
