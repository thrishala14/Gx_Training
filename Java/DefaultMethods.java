package defaultStatic;

/**
 * abstract methods in interface is overridden
 *  in the class. when two interfaces have 
 *  default methods we can override the default
 *  methods
 */

interface Interface1{
	void method1(String str);
	
	default void log(String str) {
		System.out.println("interface 1 " +str);
	}
}

interface Interface2{
	void method2(String str);
	
	default void log(String str) {
		System.out.println("interface 2 " +str);
	}
}


public class DefaultMethods implements Interface1, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods dm = new DefaultMethods();
		dm.method1("abc");
		dm.method2("xyz");
		dm.log("this is log method");
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		System.out.println("method 1 " +str);
		
	}
	
	@Override
	public void method2(String str) {
		// TODO Auto-generated method stub
		System.out.println("method 2 " +str);
	}

	

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
	}
	
//	@Override
//	public void log(String str) {
//		// TODO Auto-generated method stub
//		interface2.super.log(str);
//	}

	
}
