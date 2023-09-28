package javaDemo;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("    Left Triangle pattern");
		System.out.println("--------------------------------");
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1 ;j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("   Right Triangle pattern");
		System.out.println("--------------------------------");
		int m = 5;
		for(int i =1; i<=m;i++) {
			for(int j = m-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("       Pyramid pattern");
		System.out.println("--------------------------------");
		int l = 5;
		for(int i =0; i<l;i++) {
			for(int j = l-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i+i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
