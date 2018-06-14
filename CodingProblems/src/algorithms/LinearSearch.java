package algorithms;


/*O(N) - In the worst case, if number is not there in the list or
is at the last index of the list, we should traverse all through 
the length of the list.
O(1) - Best case - When the element is in first index of the array
*/
public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {54, 67, 87, 32, 34, 56, 87, 45, 67, 43};
		int k = 87;
		
		LinearSearch ls = new LinearSearch();
		int index = ls.findElementInArray(array, array.length, k);
		if(index < 0) System.out.println("Element not found in the list:: " + k);
		else System.out.println("Element found at index: " + index);
	}
	
	private int findElementInArray(int[] array, int size, int k) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < size; i++) {
			if(k == array[i]) {
				return i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for linear search:: " + (endTime - startTime));
		return -1;
	}
}
