package javaDemo;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 10;
		boolean bool = true;
		int c = -20;
		
		System.out.println("Arithmetic Operators");
		System.out.println("-------------------------");
		System.out.println("Addition: "+(a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Module a%b: "+(a%b));
		System.out.println("Module b%a: "+(b%a));
		
		System.out.println();
		System.out.println("Unary Operators");
		System.out.println("-------------------------");
		System.out.println("Post Increment: " + a++);
		System.out.println("Pre Increment: " + ++b);
		System.out.println("Post Decrement: " + a--);
		System.out.println("Pre Decrement: " + --b);
		
		System.out.println("Sign inversion : " + -c);
		System.out.println("Sign Inversion : " + -b);
		System.out.println("Pre : " + ~b);
		System.out.println("Pre : " + ~c);
		System.out.println("Negate : " + !bool);
		System.out.println("Negate negate: " + !!bool);
		
		System.out.println();
		System.out.println("Shift Operators");
		System.out.println("-------------------------");
		int m = 10; // 1 0 1 0
		System.out.println(m<<2); //   1 0 1 0 0 0
		System.out.println(m<<3); // 1 0 1 0 0 0 0
		System.out.println(m>>2); // 0 0 1 0
		System.out.println(m>>3); // 0 0 0 1
		
		System.out.println();
		System.out.println("Relational Operators");
		System.out.println("-------------------------");
		if(a == b) {
			System.out.println("Both a and b are equal");
		}
		
		if(a > b) {
			System.out.println("a is greater than b");
		}
		
		int x = 10;
		int y = 12;
		String val = (x==y)? "same value" : "different values";
		System.out.println(val);
		
	}
}
