package problems;

import java.util.Arrays;

/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array 
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?  --- IMPROVISE
*/
public class Day2 {
	
	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5};
		int size = array.length;
		long[] newArray = new long[size];
		findNewArray1(array, size, newArray);
		findNewArray2(array,  newArray, size);
		findNewArray3(array, size, newArray);
	}
	
	//Approach 1: Using product and division o(n^2)
	static void findNewArray1(int[] array, int size, long[] newArray) {
		int product = 1;
		for(int i = 0; i < size; i++) {
			product *= array[i];
		}
		System.out.println("Product of array:: " + product);
		
		for(int i = 0; i < size; i++) {
			newArray[i] = product/array[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	//Approach 2: without using division o(n^2)
	static void findNewArray2(int[] array, long[] newArray, int size) {
		for(int i = 0; i < size; i++) {
			int product = 1;
			for(int j = 0; j < size; j++) {
				if(i != j) {
					product *= array[j];
				}
			}
			newArray[i] = product;
		}
		
		System.out.println(Arrays.toString(newArray));
	}
	
	//Approach 3: without using division O(n)
		static void findNewArray3(int[] array, int size, long[] newArray) {
			for(int i = 0; i < size; i++) {
				
			}
			
			System.out.println(Arrays.toString(newArray));
		}
	

}
