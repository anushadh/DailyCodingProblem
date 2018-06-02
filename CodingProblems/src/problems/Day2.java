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
	
	public static void main(String args[]) {
		int[] array = new int[]{1, 2, 3, 4, 5};
		//int[] array = new int[]{3, 2, 1};
		int size = array.length;
		int[] newArray = new int[size];
		findNewArray(array, size, newArray);
		findNewArray(array,  newArray, size);
	}
	
	//Approach 1: Using product and division
	static void findNewArray(int[] array, int size, int[] newArray) {
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
	
	//Approach 2: without using division
	static void findNewArray(int[] array, int[] newArray, int size) {
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
	
	

}
