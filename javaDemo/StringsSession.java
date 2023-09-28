package javaDemo;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringsSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREATING STRINGS
		String word1 = "Hello World!";
		
		char[] word2 = {'h', 'e', 'l', 'l','o'};
		String helloWorld = new String(word2);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(helloWorld);
		String word4 = "Good morning!";
		
		//STRING LENGTH
		System.out.println("The length of " +word1+" is "+word1.length());
		
		//CONCATENATING STRINGS
		System.out.println(word1.concat(word4));
		System.out.println("hello!!! ".concat(word4));
		System.out.println("hello "+ " world");
		System.out.println("hi "+word4);
		
		//FORMATTED STRINGS
		String fs;
		float floatVar = 33;
		int intVar = 23;
		fs = String.format("The value of float variable is %f and int variable is %d",floatVar, intVar );
		System.out.println(fs);
		
		StringToNum();
		NumToString();
		Immutable();
		
		System.out.println();
		System.out.println("    STRING BUFFER    ");
		StringBuffer str = new StringBuffer("Java Data");
		str.append(" test");
		str.insert(4,  " test");
		System.out.println(str);
		str.replace(6, 8, " test");
		str.delete(0,4);
		System.out.println(str);
		StringBuffer str1 = new StringBuffer();
		str1.ensureCapacity(20);
		str1.append("cab");
		System.out.println(str1.reverse());
		System.out.println(str1.capacity());
		
		System.out.println();
		System.out.println("    STRING BUILDER    ");
		StringBuilder sb = new StringBuilder();
		System.out.println(sb + " - " +sb.capacity());
		sb.append("galaxe");
		System.out.println(sb + " - " +sb.capacity());
		sb.append("galaxe");
		sb.append("galaxe");
		System.out.println(sb + " - " +sb.capacity());
		
		System.out.println();
		System.out.println("    TOKENIZER    ");
		StringTokenizer  st = new StringTokenizer("String Tokenizer, is a part of, java.util");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer  st1 = new StringTokenizer("String Tokenizer, is a part of, java.util", ",");;
		System.out.println(st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		StringTokenizer  st2 = new StringTokenizer("String Tokenizer, is a part of, java.util", "a");;
		System.out.println(st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println();
		System.out.println("    STRING JOINER    ");
		StringJoiner sj = new StringJoiner(":","[","]");
		sj.add("galaxe").add("solutions").add("employee");
		System.out.println(sj);
		
		System.out.println();
		System.out.println("   MANIPULATING STRINGS  ");
		String string = "manipulating character in a string";
		char aChar = string.charAt(13);
		String subString = string.substring(8,20);
		System.out.println(aChar);
		System.out.println(subString);
		
		//REPLACEING CHARACTERS
		System.out.println(string.replace("a", "i"));
		
		//COMPARING STRINGS
		System.out.println();
		System.out.println("   COMPARING STRINGS  ");
		System.out.println(string.endsWith("ing"));
		System.out.println(string.endsWith("ong"));
		System.out.println(string.startsWith("man"));
		System.out.println(string.startsWith("char", 13));
		System.out.println(string.matches("~man"));
		
		
		
		
	}

	private static void Immutable() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("   IMMUTABLE  ");
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1;
		
		s1 = "Java";
		s2.concat("World!");
		String news3 = s3.concat("scaler");
		System.out.println("s1 refers to "+s1);
		System.out.println("s2 refers to "+s2);
		System.out.println("s3 refers to "+s3);
		System.out.println("new s3 refers to "+news3);
	}

	private static void NumToString() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("   NUMBER TO STRING  ");
		int num1 = 34;
		double num2 = 45.5;
		System.out.println(Integer.toString(num1) +" and "+ Double.toString(num2));
		
	}

	private static void StringToNum() {
		// TODO Auto-generated method stub
		//Convert Strings to numbers
		System.out.println();
		System.out.println("   STRING TO NUMBERS  ");
		String str1 = "5.5";
		String str2 = "6.6";
		float num1 = (Float.valueOf(str1)).floatValue();
		float num2 = (Float.valueOf(str2)).floatValue();
		System.out.println("addition : " +num1+num2);
		System.out.println("subtraction : " + (num2 - num1));
		System.out.println("multiplication : " +num1*num2);
		System.out.println("division : " +num2/num1);
	}
}
