package javaDemo;

class det{
	String name;
	int age;
	static String company = "galaxe";
}

public class StaticVariable {
	static int var = 56;
	static int a =40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(var);
		det d = new det();
		d.name = "thrishala";
		d.age = 23;
		
		det d1 = new det();
		d1.name = "asdf";
		
		
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(det.company);
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(det.company);
	}
	public void myFunc() {
		System.out.println(var);
	}
}
