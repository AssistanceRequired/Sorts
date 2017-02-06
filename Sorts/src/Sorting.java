
public class Sorting {

	/**
	 * Swaps two elements in an array
	 * @param list- the array of the two items
	 * @param place1 - index of the first item
	 * @param place2 - index of the second item
	 */
	public void swap(int[] list, int place1, int place2) {
		int temp = list[place2];
		list[place2] = list[place1];
		list [place1] = temp;
	}
	
	/** 
	 * Implements the selection sort algorithm.
	 * @param arr - An array of ints to be sorted.
	 * @return arr - An array of sorted ints
	 */
	public int[] selectionSort(int[] arr) { 
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
	public int[] insertionSort(int[] arr) {		
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
	
	/**
	 * Implements the merge sort algorithm.
	 * @param arr - An array of Strings to be sorted.
	 */	
	public void mergeSort(int[] arr,int low ,int high)
	{
		int middle;
		if (low < high) {
			// Get the index of the element which is in the middle
            middle = ((high + low) / 2);
            // Sort the left side of the array
            mergeSort(arr, low, middle);
            // Sort the right side of the array
            mergeSort(arr, (middle + 1), high);
            // Combine them both
            merge(arr, low,(middle + 1), high);
		}
	}
	/**
	 * Sorts one side of the given array
	 * @param arr - the array that will be sorted
	 * @param low - Index of lowest item
	 * @param mid - Index of middle item
	 * @param high - Index of highest item
	 * @return arr - A sorted array
	 */
	public int[] merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[arr.length];
		int leftend, elements, index;
	    /*
	     * leftend: the index of the last position of list 1
	     * elements: the number of elements in the list
	     * index is the location the list is at
	     */
        leftend = (mid - 1);
        index = low;
        elements = (high - low + 1);
        /*
         * first compare all elements from list 1 to list 2 in the array. 
         * Stop when one list has been finished.
         * The global variable temp is used to help keep track of our elements
         */
        while ((low <= leftend) && (mid <= high)) {
        	if (arr[low] <= arr[mid]) {
            	temp[index++] = arr[low++];
            }
            else {
            	temp[index++] = arr[mid++];
            }
        }
        /*
         * the next two loops finishes off the lists. After the loop above, one list 
         * is not emptied yet.
         */
        while (low <= leftend) {
            temp[index++] = arr[low++];
        }
 
        while (mid <= high) {
            temp[index++] = arr[mid++];
        }
        // bring back the elements from temp to the location of arr
        //This is required because we are sorting the list from two already sorted list
       while(elements > 0 ) {
    	   arr[high] = temp[high];
    	   high--;
    	   elements--;
       }
       return arr;
	}
}
