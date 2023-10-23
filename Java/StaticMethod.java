package defaultStatic;

interface interface3{
	static void staticMethod() {
		System.out.println("this is static method");
	}
	
	void abstractMethod(String str);
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod s = new StaticMethod();
		s.abstractMethod("this is abstract method");
		interface3.staticMethod();
		s.staticMethod(); //not recommended
		
	}

	private void abstractMethod(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	static void staticMethod() {
		System.out.println("this is static method overriden");
	}
	
}
