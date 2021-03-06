public class SortRunner {
	
	public static void main(String[] args) {
		
		int[] arr = arrayBuilder(100);
		
		Sorting sort = new Sorting();
		
		System.out.print("Array before Insertionsort: ");
		printArray(arr);
		sort.insertionSort(arr);
		printArray(arr);
		
		scramble(arr);
		System.out.print("\nArray before Selectionsort: ");
		printArray(arr);
		sort.selectionSort(arr);
		printArray(arr);
		
		scramble(arr);
		System.out.print("\nArray before Mergesort: ");
		printArray(arr);
		sort.mergeSort(arr,0,arr.length -1);
		printArray(arr);
		
		scramble(arr);
		System.out.print("\nArray before Quicksort: ");
		printArray(arr);
		sort.quickSort(arr,0,arr.length-1);
		printArray(arr);
		
		scramble(arr);
		System.out.print("\nArray before Bubblesort: ");
		printArray(arr);
		sort.bubbleSort(arr);
		printArray(arr);
		
	}
	
	/**
	 * Builds an array of random integer values.
	 * @param x  number of ints requested in the array
	 * @return array of x integers
	 * 
	 */
	public static int[] arrayBuilder(int size) {
		
		int[] arr = new int[size];
		
		for(int a = 0; a < size; a++) {
			arr[a] = (int)(Math.random()*10);
		}
		return arr;
	}
	
	/**
	 * Simple method that scrambles integers in an array
	 * @param arr
	 */
	public static void scramble(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			new Sorting().swap(arr,i,(int)(Math.random()*arr.length));
		}
	}
	
	/**
	 * Prints out a one dimension array
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		
		for(int a: arr) {
			System.out.print(a + " ");
		}
			System.out.println();
	}
	
}
