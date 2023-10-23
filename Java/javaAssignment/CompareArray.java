package javaAssignment;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10, 20 ,30};
		int[] array2 = {10, 40, 30};
		int flag = 1;
		int max = Math.max(array1.length, array2.length);
		for(int i = 0; i < max; i++) {
			if(array1[i] != array2[i]) {
				flag = 0;
			}
		}
		if(flag == 0) {
			System.out.println("array is not same");
		}
		else {
			System.out.println("array is same");
		}
	}

}
