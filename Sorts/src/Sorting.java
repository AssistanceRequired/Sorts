
public class Sorting {

	/**
	 * Swaps two elements in an array
	 * @param list- the array of the two items
	 * @param place1 - index of the first item
	 * @param place2 - index of the second item
	 */
	public static void swap(int[] list, int place1, int place2) {
		int temp = list[place2];
		list[place2] = list[place1];
		list [place1] = temp;
	}
	
	/** 
	 * Implements the selection sort algorithm.
	 * @param arr - An array of ints to be sorted.
	 * @return arr - An array of sorted ints
	 */
	public static int[] selectionSort(int[] arr) { 
		/* loops to the second to last item. Last item will be automatically sorted.
		 * Selection sort always keep one side of the list sorted.
		 */
		for (int i = 0; i < arr.length-1; i++) {  
			// the index of the smallest value
	        int index = i;  
	        for (int a = i + 1; a < arr.length; a++) {  
	        	if (arr[a] < arr[index]) {  
	        		index = a; 
	            }  
	        }  
	        //swapping the location of where we are with the smallest value
	        swap(arr,index,i); 
		} 
		 	return arr;
	}  
	/**
	 * Implements the insertion sort algorithm.
	 * @param arr - An array of ints to be sorted.
	 * @return arr - An array of sorted ints
	 */	
	public static int[] insertionSort(int[] arr) {		
		//starts by comparing the first two integers
		for(int a = 1; a <arr.length; a++) {
			// int will be compared to the left side of the list
			for(int b = a ; b>0; b--) {
				if(arr[b] < arr[b-1]) {
					swap(arr,b-1,b);
				}
			}
		}
		return arr;
	}
}
