package Array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int arr[]={2,5,4,4};
		boolean f=nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static boolean nextPermutation(int[] array) {
		// TODO Auto-generated method stub
		  int i = array.length - 1;
		    while (i > 0 && array[i - 1] >= array[i])
		        i--;
		    // Now i is the head index of the suffix
		    
		    // Are we at the last permutation already?
		    
		    if (i <= 0)
		        return false;
		    
		    // Let array[i - 1] be the pivot
		    // Find rightmost element that exceeds the pivot
		    int j = array.length - 1;
		    while (array[j] <= array[i - 1])
		        j--;
		    // Now the value array[j] will become the new pivot
		    // Assertion: j >= i
		    
		    // Swap the pivot with j
		    System.out.println(i+":::"+j);
		    int temp = array[i - 1];
		    array[i - 1] = array[j];
		    array[j] = temp;
		    System.out.println(Arrays.toString(array));  
		    // Reverse the suffix
		    j = array.length - 1;
		    while (i < j) {
		        temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		        i++;
		        j--;
		    }
		    return true;
	}

}
