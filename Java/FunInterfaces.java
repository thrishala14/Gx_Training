package functionalInterfaces;

public abstract class FunInterfaces implements FunctionalInterfaces,if1, if2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaces x = (i, j) -> {
			int a = i+j;
			return a;
		};
		System.out.println(x.display(7, 8));
		
		
		FunctionalInterfaces1 y = (i, j) -> {
			System.out.println(i*j);
		};
		y.display(10, 20);
		

		if1 d1 = (r, t) -> {
			System.out.println("same arguement" +r +t);
		};
		d1.display1(4, 5);
		
	}
}


