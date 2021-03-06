package algorithms;

import java.util.Arrays;

public class BigONotation {
	
	private int[] array;
	private int arraySize, itemsInArray;
	private long startTime, endTime;
	
	public static void main(String[] args) {
		
		BigONotation algo1 = new BigONotation(100);
		//O(1) add an item into an array
		/*algo1.addElement(10);
		System.out.println(Arrays.toString(algo1.array));*/	
		
		//O(N) -- Linear Search &&  O(log N) -- Binary Search
		/*BigONotation algo2 = new BigONotation(10000);
		algo2.generateArray();		
		algo2.linearSearch(150);		
		algo2.binarySearch(150);
		
		BigONotation algo3 = new BigONotation(2000000);
		algo3.generateArray();
		algo3.linearSearch(30);	
		algo3.binarySearch(30);
		
		BigONotation algo4 = new BigONotation(5000000);
		algo4.generateArray();
		algo4.linearSearch(20);		
		algo4.binarySearch(20);*/
		
		//O(N^2) - Bubble Sort
		BigONotation algo5 = new BigONotation(100000);
		algo5.generateArray();
		algo5.bubbleSort();
		System.out.println(Arrays.toString(algo5.array));
		
		BigONotation algo6 = new BigONotation(10000);
		algo6.generateArray();
		algo6.bubbleSort();
		System.out.println(Arrays.toString(algo6.array));
		
	}
	
	/*O(N^2) - Execution time is proportional to square of data involved.
	Below implementation has nested iterations - More nested iterations will have O(N^3), O(N^4) etc
	For each loop, the inner iteration has to go through the entire list*/
	public void bubbleSort() {
		startTime = System.currentTimeMillis();
		for(int i = 0; i < arraySize; i++) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j+1]) {
					swapValues(j, j+1);
				}
			}
		}
		endTime = System.currentTimeMillis();		
		System.out.println("Bubble sort took :: " + (endTime-startTime));
	}
	
	/*O(log N) - time taken is proportional to log n 
	 * and for every iteration reduces the data by 50%
	 * which proves to be more efficient that o(N)*/
	public void binarySearch(int element) {
		Arrays.sort(array);
		startTime = System.currentTimeMillis();
		int start = 0, end = arraySize - 1, mid = 0;		
		int loopCount = 0;
		while(start <= end) {
			mid = (start+end)/2;
			if(array[mid] < element) {
				start = mid + 1;
			} else if(array[mid] > element) {
				end = mid - 1;
			} else {
				System.out.println("BS-Element found at:: " + mid);
				start = end + 1;
			}
			loopCount++;
		}
		endTime = System.currentTimeMillis();		
		System.out.println("BS-Time taken:: " + (endTime-startTime) + " in " + loopCount + "loops");
		System.out.println("****************************************");
	}
	
	/*O(N) - the time taken is directly proportional to the size of data
	 * For finding an element in the array, linear search has to be performed
	 * to look up at each and every index to find a match */
	public void linearSearch(int element) {
		startTime = System.currentTimeMillis();
		String elementFound = "";
		for(int i = 0; i < arraySize; i++) {
			if(element == array[i]) {
				elementFound += i + " ";
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("LS-Element found at:: " + elementFound);		
		System.out.println("LS-Time taken:: " + (endTime-startTime));
	}
		
	/*O(1) takes constant time to execute irrespective 
	of the increase in size of data*/
	public void addElement(int element) {
		startTime = System.currentTimeMillis();
		array[itemsInArray++] = element;
		endTime = System.currentTimeMillis();
		System.out.println("Time taken:: " + (endTime-startTime));
	}
	
	public void swapValues(int a, int b) {
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
	}
	
	public void generateArray() {
		for(int i = 0; i < arraySize; i++) {
			array[i] = (int) ((Math.random()*1000) +10);
		}
		itemsInArray = arraySize - 1;
	}
	
	public BigONotation(int size) {
		arraySize = size;
		array = new int[arraySize];
	}
}
