package javaDemo;

import java.util.Scanner;

public class AddPosNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter numbers");
		int arr[]=new int[5];
		for(int i = 0; i<5; i++) {
			arr[i]= s.nextInt();
		}
		for(int j = 0; j<5;j++) {
			if(arr[j]>0) {
				sum +=arr[j];
			}
		}
		System.out.println(sum);
		s.close();
	}
}
