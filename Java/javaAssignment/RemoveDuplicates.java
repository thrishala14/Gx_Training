package javaAssignment;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color = {"red", "blue", "green", "red", "red", "yellow"};
		HashSet<String> col = new HashSet<String>();
		for(String c:color) {
			col.add(c);
		}
		System.out.println(col);
	}

}
