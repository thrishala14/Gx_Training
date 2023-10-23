package assignment17th;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeDetails{

	public static void main(String[] args) throws StringException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Enter first name:");
			String fname = sc.next();
			for(int i = 0; i<fname.length();i++) {
				Character c = fname.charAt(i);
				if(Character.isDigit(c)) {
					throw new StringException();
				}
			}
		} catch (StringException s) {
			System.out.println("Incorrect first name: " +s);
		}
		
		
		try {
			System.out.println("Enter last name:");
			String lname = sc.next();
			for(int i = 0; i<lname.length();i++) {
				Character c = lname.charAt(i);
				if(Character.isDigit(c)) {
					throw new StringException();
				}
			}
		} catch (StringException s) {
			System.out.println("Incorrect last name: " +s);
		}
				
		try {
			System.out.println("Enter age");
			int age = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect age: " +e);
		}
		
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter salary");
			int salary = s.nextInt();
		} catch (Exception e) {
			System.out.println("Incorrect salary" +e);
		}
		
		try {
			System.out.println("Enter DOJ");
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			String dateInString = s.next();
			date.parse(dateInString);
		} catch (Exception e) {
			System.out.println("Incorrect date " +e);
		}
		
		System.out.println("Done!!");
		
	}

}
