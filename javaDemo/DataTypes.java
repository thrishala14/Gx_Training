package javaDemo;

import java.util.Arrays;

public class DataTypes {
	public static void main(String []args) {
		char a = 'G';
		int i = 89;
		byte b = 4;
		//byte b1 = 99999999999999; error
		short s = 56;
		//short s1 = 888888888888; error
		double d = 9.876543d;
		float f = 9.876543f;
		long l = 12121;
		boolean bl = true;
		
		System.out.println("char: " +a);
		System.out.println("integer: " +i);
		System.out.println("byte: " +b);
		System.out.println("short: " +s);
		System.out.println("double: " +d);
		System.out.println("float: " +f);
		System.out.println("long: " +l);
		System.out.println("boolean: " +bl);
		
		System.out.println();
		
		System.out.println("PRIMITIVE DATA TYPES ");
		int x = 10;
		int y = x;
		System.out.println("Initially:");
		System.out.println("x is " +x+ ", y is "+y);
		y = 30;
		System.out.println("After changing:");
		System.out.println("x is " +x+ ", y is "+y);
		
		System.out.println();
		
		System.out.println("REFERENCE DATA TYPES ");
		int[] c = {10, 20, 30, 40};
		int[] e = c;
		System.out.println("Initially:");
		System.out.println("c is " + Arrays.toString(c)+",e is " + Arrays.toString(e));
		e[1] = 100;
		System.out.println("After changing:");
		System.out.println("c is " + Arrays.toString(c)+",e is " + Arrays.toString(e));
	}
}
