package javaAssignment;

public class BinarySearch {
	
	public static int binarySearch(int[] array, int num) {
		// TODO Auto-generated method stub
		int low = 0, high = array.length - 1;
		while(high>=low) {
			int mid = (high+low)/2;
			if(array[mid] == num) {
				return mid;
			}
			else if(array[mid]>num) {
				high = mid -1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 2, 5, 8, 18, 19, 20, 50, 59, 60};
		int num = 20;
		int pos = binarySearch(array, num);
		if(pos == -1) {
			System.out.println("Number not found!!");
		} else {
			System.out.println("number " +num+ " is at position " +pos);
		}
		
	}

	

}
