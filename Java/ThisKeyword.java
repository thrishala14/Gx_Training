package CoreJava;

class Emp{
	
	int id;
	int age;
	
	public Emp(int id, int age){
		this.id = id;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1, 30);
		Emp e2 = new Emp(0, 0);
		e2.id = 2;
		e2.age = 40;
		System.out.println(e1.getId() + " " + e1.getAge());
		System.out.println(e2.id + " " + e2.age);
	}

}
