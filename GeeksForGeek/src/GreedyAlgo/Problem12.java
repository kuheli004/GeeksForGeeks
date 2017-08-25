package GreedyAlgo;

import java.util.Arrays;

public class Problem12 {
	static int arr[] = new int[]{1, 15, 10} ;
    
    // Modifies the array by subtracting/adding
    // k to every element such that the difference
    // between maximum and minimum is minimized
    static int getMinDiff( int n, int k)
    {
        // There should be at least two elements
        if (n <= 1)
            return 0;
  
        // Sort array in increasing order
        Arrays.sort(arr);
  
        // Initialize maximum and minimum
        int maxe = arr[n-1];
        int mine = arr[0];
         
        // If k is more than difference between maximum 
        // and minimum, add/subtract k to all elements
        // as k cannot decrease the difference
        if (k >= maxe - mine)
        {
            for (int i=0; i<n; i++)
                arr[i] += k; // Subtract would also work
            return (maxe - mine);
        }
  
        // In sorted array, first element is minimum
        // and last is maximum, we must add k to minium
        // and subtract k from maximum
        arr[0]   += k;
        arr[n-1] -= k;
  
        // Initialize mac and min of modified array (only
        // two elements have been finalized)
        int new_max = Math.max(arr[0], arr[n-1]);
        int new_min = Math.min(arr[0], arr[n-1]);
  
        System.out.println(new_max+":::"+new_min);
        // Finalize middle n-2 elements
        for (int j=1; j<n-1; j++)
        {
            // If current element is less than min of
            // modified array, add k.
            if (arr[j] < new_min)
                arr[j] += k;
             
            // If current element is more than max of
            // modified array, subtract k.
            else if (arr[j] > new_max)
                arr[j] -= k;
  
            // arr[j] is between new_min and new_max
  
            // If arr[j] is closer to new_max, subtract k
            else if ((arr[j] - new_min) > (new_max - arr[j]))
                arr[j] -= k;
  
            // Else add k
            else
                arr[j] += k;
            System.out.println("arr[j]::::"+arr[j]);    
            // Update new_max and new_min if required
            new_max = Math.max(arr[j], new_max);
            new_min = Math.min(arr[j], new_min);
            System.out.println(new_max+":::"+new_min);
        }
  
        // Returns difference between new_max and new_min
        return (new_max - new_min);
}
  
    // Driver method to test the above function
    public static void main(String[] args) {
         
    int k = 6;
    int res = getMinDiff(arr.length, k);
  
    System.out.println("Modified array is ");
     
    System.out.println(Arrays.toString(arr));
  
    System.out.println("\nMaximum difference is "+ res);
     
    }

}
