import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * Class with methods for working with and manipulating Arrays and ArrayLists. 
 */
public class ArrayAndArrayList {

	/**
	 * Counts the number of occurrences of the given element in the given array.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     * 
	 * @param array to search
	 * @param element to search for
	 * @return number of times element is in array
	 */
	public int howMany(int[] array, int element) {

		int nr = 0;

        for(int i = 0; i< array.length; i++)
            if(element == array[i])
                nr++;

		return nr;
	}
	
	/**
	 * Finds the max number in the given array.
	 * If the array is empty, returns -1.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
	 * 
	 * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     * 
	 * @param array to search
	 * @return max number in array
	 */
	public int findMax(int[] array) {

		if(array.length == 0)
			return -1;

		int max = array[0];

		for(int i = 1; i< array.length; i++)
            if(max < array[i])
                max = array[i];

		return max;
	}
	
	/**
	 * Keeps track of every occurrence of the max number in the given array.
	 * Returns an ArrayList that contains every occurrence of the max number.
	 * Uses the findMax(int[] array) method.
	 * If the array is empty, returns null.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     * 
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     * 
	 * @param array to search
	 * @return ArrayList containing every instance of the max
	 */
	public ArrayList<Integer> maxArray(int[] array) {
		
		if(array.length == 0)
			return null;

		ArrayList<Integer> al = new ArrayList<Integer>();

		int max = findMax(array);

		for(int i = 0; i< array.length; i++)
            if(max == array[i])
                al.add(max);

		return al;
	}
	
	/**
	 * Puts all of the zeros in the given array, at the end of the given array.
	 * Updates the array itself.
	 * Maintains the order of the non-zeros.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     * 
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     * 
	 * @param array to search for zeros
	 */
	public void swapZero(int[] array) {

			

			int[] aux = new int[array.length];
			aux = array;
			int j = 0;
			int nr = 0;

			for(int i : array){
				if( i != 0 )
                {
					//System.out.println("i!=0: "+i);
                    aux[j] = i;
					System.out.println("auxj: "+aux[j]);
                    j++;
					nr++;
                }
				
			}

			//System.out.println("jOut= " + nr);

			for(int k = nr; k < aux.length; k++){
					//System.out.println("auxj: "+aux[j]);
                    aux[k] = 0;
			}

			for(int x = 0; x < array.length; x++){
				array[x] = aux[x];
				//System.out.print(array[x]);
			}

			//System.out.print("\n");
	}

	/*public static void main(String[] args){
			ArrayAndArrayList aa = new ArrayAndArrayList();

			int[] array = {0, 1, 0, 2, 0, 3, 0, 5};

			aa.swapZero(array);
	}*/
}