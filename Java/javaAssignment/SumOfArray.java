package javaAssignment;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40};
		int sum = 0;
		for(int num:array) {
			sum += num;
		}
		System.out.println("The sum is " +sum);
	}

}
