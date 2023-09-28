package javaDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] name = {
				{"Mr. ","Mrs. ","Ms. "},
				{"Smith", "Jones"}
		};
		System.out.println(name[0][0] +name[1][0]);
		System.out.println(name[0][2] +name[1][1]);
		System.out.println(name.length);
		
		int[] a = {2, 3, 1, 2, 4, 5};
		for (int num : a) {
            System.out.print(num + " ");
        }
		
		System.out.println();
		Arrays.sort(a);
		for (int num : a) {
            System.out.print(num + " ");
        }
		System.out.println();
		int[][] jagged = new int[4][];
		int[] arr1 = {3, 5, 3, 1};
		int[] arr2 = {5, 3, 1};
		int[] arr3 = {3, 8,3,2};
		int[] arr4 = {};
		
		jagged[0] = arr1;
		jagged[1] = arr2;
		jagged[2] = arr4;
		jagged[3] = arr3;
		System.out.println(Arrays.deepToString(jagged));
		
		final int[] d = {10, 20, 30};
		int[] b = {50, 60, 70};
		d[0] = 100;
		b[0] = 100;
		for (int num : d) {
            System.out.print(num + " ");
        }
		for (int num : b) {
            System.out.print(num + " ");
        }
		System.out.println();
		int array_size = 6;
		int[] int_array = (int[])Array.newInstance(int.class,array_size);
		System.out.println(Arrays.toString(int_array));
		System.out.println("intArray[0] = " + Array.get(int_array,0));
		System.out.println("array lenght = "+ Array.getLength(int_array));
		
		
		
	}

}
