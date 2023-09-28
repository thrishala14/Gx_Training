package javaDemo;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONTINUE STATEMENT
		
		for(int i =0; i<100;i++) {
			if(i % 5==4) {
				continue;
			}
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println();
		
		//BREAK STATEMENT
		
		for(int i =0; i<100;i++) {
			if(i % 5 ==4) {
				break;
			}
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println();
		
		int val = 2;
		switch(val){
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default: 
			System.out.println("???");
			break;
		}
		
		System.out.println();
		//RETURN STATEMENT
	
		System.out.println(test2.isNumPositive(-10));
		
	}
	public static boolean isNumPositive(int val) {
		if (val>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
