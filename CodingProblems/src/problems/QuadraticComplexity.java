package problems;

/*Identify whether one array is a subset of another, Intersection of two arrays*/


public class QuadraticComplexity {
	public static void main(String[] args) {
		
		int[] array1 = new int[] {2, 3, 4, 5, 6};
		int[] array2 = new int[] {4, 5, 6};
		int m = array1.length;
		int n = array2.length;
		
		QuadraticComplexity obj = new QuadraticComplexity();
		boolean isSubSet = obj.isSubSet(array1, array2, m, n);
		System.out.println("Array1 is a subset of Array2:: " + isSubSet);
		
		QuadraticComplexity obj2 = new QuadraticComplexity();
		obj2.findIntersection(array1, array2, m, n);
	}
	
	private boolean isSubSet(int[] array1, int[] array2, int m, int n) {

		if(n < m) 
			return false;
		
		for(int i = 0; i < m; i++) {
			boolean isSubSet = false;
			for(int j = 0; j < n; j++) {
				if(array1[i] == array2[j]) {
					isSubSet = true;
					break;
				}
			}
			if(!isSubSet) {
				return false;
			}
		}
		
		return true;
	}
	
	private void findIntersection(int[] array1, int[] array2, int m, int n) {
		System.out.println("Intersection of arrays:: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}			
		}
		
	}
	
	
}
