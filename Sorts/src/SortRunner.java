public class SortRunner {
	
	public static void main()
	{
		int[] arr = arrayBuilder(100);
		
	}
	/**
	 * Builds an array of random integer values.
	 * @param x  number of ints requested in the array
	 * @return array of x integers
	 * 
	 */
	public static int[] arrayBuilder(int size) {
		
		int [] arr = new int[size];
		for (int y = 0; y <= size; y++) {
			//placing randomly generated integers into an array
			arr[y] = (int)Math.random()*10;
		}
		return arr;
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
