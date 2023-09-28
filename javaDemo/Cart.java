package javaDemo;
import java.io.IOException;
import java.util.Scanner;
public class Cart {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int amt = 0;
		
		System.out.println("The products are:");
		System.out.println("1. a - Rs. 700");
		System.out.println("2. b - Rs. 200");
		System.out.println("3. c - Rs. 300");
		System.out.println("4. d - Rs. 400");
		System.out.println("5. e - Rs. 500");
		System.out.println("6. f - Rs. 600");
		System.out.println("7. g - Rs. 100");
		System.out.println("8. h - Rs. 200");
		System.out.println("9. i - Rs. 300");
		System.out.println("10. j - Rs. 400");
		
		System.out.println("Done??? Press 0");
	
		while(true) {
			System.out.print("Enter product number: ");
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			if(x==0) 
				break;
			switch(x) {
				case 1: amt +=700;
					System.out.println("Item : a and cost : 700");
					System.out.println("Amount : " +amt);
					
					break;
				case 2: amt +=800;
					System.out.println("Item : b and cost : 800");
					System.out.println("Amount : " +amt);
					break;
				case 3: amt +=500;
					System.out.println("Item : c and cost : 500");
					System.out.println("Amount : " +amt);
					break;
				case 4: amt +=900;
					System.out.println("Item : d and cost : 900");
					System.out.println("Amount : " +amt);
					break;
				case 5: amt +=500;
					System.out.println("Item : e and cost : 500");
					System.out.println("Amount : " +amt);
					break;
				case 6: amt +=600;
				System.out.println("Item : f and cost : 600");
				System.out.println("Amount : " +amt);
				break;
				case 7: amt +=100;
				System.out.println("Item : g and cost : 100");
				System.out.println("Amount : " +amt);
				break;
				case 8: amt +=200;
				System.out.println("Item : h and cost : 200");
				System.out.println("Amount : " +amt);
				break;
				case 9: amt +=300;
				System.out.println("Item : i and cost : 300");
				System.out.println("Amount : " +amt);
				break;
				case 10: amt +=400;
				System.out.println("Item : j and cost : 400");
				System.out.println("Amount : " +amt);
				break;
				default: System.out.println("Item out of stock");
			}
		}
		int discount =0;
		if(amt>2500) {
			discount = (int) (amt - amt*0.1);
		}
		else if(amt>2000) {
			discount = (int) (amt - amt*0.05);
		}
		else {
			discount = amt;
		}
		System.out.println("The price is:" +amt);
		System.out.println("After discount: " +discount);	
	}
}
