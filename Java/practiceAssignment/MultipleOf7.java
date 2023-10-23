package practiceAssignment;

import java.util.ArrayList;

/**
 * 		18.	 Write a program to display the 1st , 2nd , and 4th multiple of 7 
 * 			which gives the remainder 1 when divided by 2,3,4,5 and 6 
 */
public class MultipleOf7 {
	public static void main(String[] args) {
		int multiple = 0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(al.size()<=3) {
			multiple = multiple + 7;
			if(multiple%2 == 1 && multiple%3 == 1 && multiple%4 == 1 && multiple%5 ==1 && multiple%6==1)
			{
				al.add(multiple);
			}
		}
		
		System.out.println("The 1st multiple: " +al.get(0));
		System.out.println("The 2nd multiple: " +al.get(1));
		//System.out.println("The 3rd multiple: " +al.get(2));
		System.out.println("The 4th multiple: " +al.get(3));
	}
}
