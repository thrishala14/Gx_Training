package practice23rd;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PIN");
		String pin = sc.nextLine();
		boolean validation = validate(pin);
		if(validation == true) {
			System.out.println("Valid PIN");
		}
		else {
			System.out.println("Invalid PIN!!");
		}
		sc.close();
	}

	private static boolean validate(String pin) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(Pattern.matches("\\d+" ,pin) == true) {
			int length = pin.length();
			if(length==4 || length == 6) {
				if(!pin.contains(" "))
					flag = true;
			}
		}
		
		return flag;
		
	}

}
