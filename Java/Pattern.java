package assignment17th;

public class Pattern {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		for(int i = 1;i <= n; i++) {
			for(int j = 1; j<=i;j++) {
				if(i%2==0) {
					break;
				}
				for(int k = 3;k>=i;k--) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = n-1;i >0; i--) {
			for(int j = 1; j<=i;j++) {
				if(i%2==0) {
					break;
				}
				for(int k = 3;k>=i;k--) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
