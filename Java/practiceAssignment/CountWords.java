package practiceAssignment;

/**
 * Write a Java Program to count the number of words in a string using HashMap.
 * Inuput is : String str = "This this is is done by Kalyani Kalyani";
 * Output: {Kalyani=2, by=1, this=1, This=1, is=2, done=1}
 */


import java.util.Scanner;
import java.util.HashMap;


public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String s = "";
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for(int i = 0; i<words.length();i++) {
			char c = words.charAt(i);
			if(c!= ' ') {
				s+=c;
			}
			
			else 
			{
				if(!count.containsKey(s)) {
					count.put(s, 1);
				}
				else
				{
					count.replace(s, count.get(s)+1);
				}
				s="";
			}
			
		}
		System.out.println(count);
	}

}
