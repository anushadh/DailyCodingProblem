package problems;

import java.util.Arrays;

/*Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.*/

public class Day4 {
	public static void main(String args[]) {
		int[] array = new int[] {3, 4, -1, 0};
		//int[] array = new int[] {-1, -2, 1};
		int missingNumber = findMissingInteger(array);
		System.out.println("Missing positive integer:: " + missingNumber);
	}
	
	static int findMissingInteger(int[] array) {
		Arrays.sort(array);
		int temp = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {	
				temp = array[i] + 1;
				if(i == array.length-1 || temp != array[i+1]) {
					return temp;
				} 				
			}
		}
		return -1;
	}
	
	
}
