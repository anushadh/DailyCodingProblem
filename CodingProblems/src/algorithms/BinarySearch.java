package algorithms;

/* O(Log N) - With every iteration, input data is reduced by 50%
 * which reduced the number of loops
 * Binary search assumes that the list is sorted. It may not give 
 * expected results if list is unsorted
 */

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] array = new int[] {4, 7, 9, 3, 2, 7, 1}; 
		int[] sortedArray = new int[] {3, 5, 7, 9, 10};
		int k = 7;
		BinarySearch bs = new BinarySearch();
		System.out.println("****Unsorted Array****");
		int index = bs.binarySearchOfElement(array, array.length, k);
		if(index < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at:: " + index);
		}
		System.out.println("****Sorted Array****");
		index = bs.binarySearchOfElement(sortedArray, sortedArray.length, k);
		if(index < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at:: " + index);
		}
		//Not working
		int element = bs.binarySearch(sortedArray, k, 0, sortedArray.length-1);
		if(element < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at:: " + element);
		}
	}
	
	private int binarySearchOfElement(int[] array, int size, int k) {
		int start = 0;
		int end = size-1;
		
		while(start < end) {
			int mid = (start + end) / 2;
			if(k == array[mid]) {
				return mid;
			} else if(k < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}		
		return -1;
	}
	//Recursive
	private int binarySearch(int[] array, int k, int start, int end) {
		if(start > end) {
			return -1;
		}		
		int mid = (start + end)/2;
		if(k == array[mid]) {
			return mid;
		} else if(k > array[mid]) {
			binarySearch(array, k, mid+1, end);
		} else {
			binarySearch(array, k, start, mid-1);
		}
		
		return -1;
		
	}
}
