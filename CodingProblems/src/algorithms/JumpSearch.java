package algorithms;


/* O(Root N) - Works for Sorted lists
 * As the name says jump search jumps by m blocks while 
 * traversing, and if the element found is greater than required element,
 * we will jump back to m-1th element to do linear search.
 * Performance is between Linear and Binary Search
 */

public class JumpSearch {

	public static void main(String[] args) {
		
		int[] array = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
		int x = 55;
		int size = array.length;
		
		int index = jumpSearch(array, size, x);
		if(index >= 0) {
			System.out.println("Element found at:: " + index);
		} else System.out.println("Element not found");
	}
	
	static int jumpSearch(int[] array, int size, int x) {
		
		//Find m - the number of blocks to be jumped
		int m = (int) Math.floor(Math.sqrt(size));
		int higherindex = -1;
		for(int i = 0; i < size; i+=m) {
			System.out.println("Jumps");
			if(array[i] > x) {
				higherindex = i;
				break;
			}
		}
		
		if(higherindex > 0) {
			for(int i = higherindex-1; i > higherindex-m+1; i--) {
				System.out.println("Linear");
				if(array[i] == x) {
					return i;
				}
			}
		}
		
		return -1;
	}

}
