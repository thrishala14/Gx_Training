package defaultStatic;

interface Test{
	default void test1() {
		System.out.println("interfcae");
	}
}

abstract class AbstractClass implements Test{
	public abstract void test1();
}

public class DefaultAbstract extends AbstractClass{
	public static void main(String[] args) {
		DefaultAbstract d = new DefaultAbstract();
		d.test1();
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("main class");
	}
}
