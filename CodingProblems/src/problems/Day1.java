package problems;

import java.util.Arrays;
import java.util.HashSet;

/*Given a list of numbers, return whether any two sums to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/

public class Day1 {

	public static void main(String[] args) {
		int[] list = new int[]{10, 15, 3, 7};
		int k = 17;
		boolean isSumK = isSumK(list, k);
		System.out.println("isSumK:: " + isSumK);
		System.out.println("****************");
		//Bonus: Do it in one pass
		findPair(list, k);
		System.out.println("****************");
		findPairWithSet(list, k);
	}
	
	//Using all the possibilities of pairs O(n^2) -- Two Loops
	static boolean isSumK(int[] list, int sum) {
		int sizeOfList = list.length;
		boolean isTrue = false;
		for(int i = 0; i < sizeOfList - 1; i++) {
			for(int j = i+1; j < sizeOfList; j++) {
				if(list[i] + list[j] == sum) {
					isTrue = true;
					System.out.println("Sum:: " + list[i] + " + "
							+ "" + list[j] + " = " + sum);
					return isTrue;
				}
			}
		}
		return isTrue;
	}
	
	//Sort the array Quick Sort-- O(n logn) and loop once 
	static void findPair(int[] list, int sum) {
		int size = list.length;
		Arrays.sort(list);
		int start = 0;
		int end = size - 1;
		while(start < end) {
			if(list[start] + list[end] == sum) {
				System.out.println("Sum in pair:: " + list[start] + " + "
						+ "" + list[end] + " = " + sum);
				break;
			}
			else if(list[start] + list[end] < sum) {
				start++;
			} else {
				end--;
			}
		}	
	}
	
	//Best Approach -- O(n) for hash set insertion and O(1) for for look up
	static void findPairWithSet(int[] list, int sum) {
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < list.length; i++) {
			 int diff = sum - list[i];
			 if(hs.contains(diff)) {
				 System.out.println("List contains pair with sum: " + sum + " ("
				 		+ list[i] + "," + diff + ")");
			 }
			 hs.add(list[i]);
		}
		
	}
}
