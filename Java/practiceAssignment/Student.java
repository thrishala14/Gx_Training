package practiceAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 5.	Write a program to accept a student’s name and scores in three subject. 
 * 		Display the 1st, 2nd, average and total. 
 * 		Display whether the student has secured 1st , 2nd , pass class or has failed. 
 * 		1st class is for a score of 60 and above, 2nd class is for a score of 50 and above, 
 * 		while pass class is for a score of 35 and above. If the score is less than 35, then the student fails. 
 */

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Student Name: ");
		String studentName = scanner.nextLine();
		
		System.out.print("1st Subject Marks: ");
		float firstSubjectMarks = scanner.nextFloat();
		
		System.out.print("2nd Subject Marks: ");
		float secondSubjectMarks = scanner.nextFloat();
		
		System.out.print("3rd Subject Marks: ");
		float thirdSubjectMarks = scanner.nextFloat();
		
		scanner.close();
		
		HashMap<Float, String> marks = new HashMap<Float, String>();
		
		marks.put(firstSubjectMarks, "Subject 1");
		marks.put(secondSubjectMarks, "Subject 2");
		marks.put(thirdSubjectMarks, "Subject 3");
		
		ArrayList<Float> list = new ArrayList<Float>();
		list.add(firstSubjectMarks);
		list.add(secondSubjectMarks);
		list.add(thirdSubjectMarks);
		
		Collections.sort(list);
		
		float highestMarks = list.get(2);
		System.out.println("The highest marks obtained is " +highestMarks+ " in " + marks.get(highestMarks));
		
		
		float secondHighestMarks = list.get(1);
		System.out.println("The second highest marks obtained is " +secondHighestMarks+ " in " + marks.get(secondHighestMarks));
		
		float thirdHighestMarks = list.get(0);
		System.out.println("The second highest marks obtained is " +thirdHighestMarks+ " in " + marks.get(thirdHighestMarks));
		
		float averageMarks = (firstSubjectMarks + secondSubjectMarks + thirdSubjectMarks ) / 3;
		System.out.println("The average marks is " +averageMarks);
		
		float totalMarks = firstSubjectMarks + secondSubjectMarks + thirdSubjectMarks ;
		System.out.println("The total marks is " +totalMarks);
		
		String grade1 = grade(firstSubjectMarks);
		String grade2 = grade(secondSubjectMarks);
		String grade3 = grade(thirdSubjectMarks);
		
		
		System.out.println("=================================");
		System.out.println(studentName +"'s Report Card" );
		System.out.println("=================================");
		System.out.println("Subject 1:  " +firstSubjectMarks+". Grade is " +grade1);
		System.out.println("Subject 2:  " +secondSubjectMarks+". Grade is " +grade2);
		System.out.println("Subject 3:  " +secondSubjectMarks+". Grade is " +grade3);
		
	}

	private static String grade(float marks) {
		// TODO Auto-generated method stub
		String grade = null;
		if(marks<=100) {
			if(marks>=60) {
				grade = "1st Class";
			}
			else if(marks>=50 && marks<60) {
				grade = "2nd Class";
			}
			else if(marks>=35 && marks<50) {
				grade = "Pass";
			}
			else
				grade = "FAIL";
		}
		return grade;
		
	}
}
