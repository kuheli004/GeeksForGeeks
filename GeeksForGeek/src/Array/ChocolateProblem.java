package Array;

import java.util.Arrays;

public class ChocolateProblem {

	public static void main(String[] args) {
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12} ;
		int n=arr.length;
		int m=5;
		System.out.println(findMinDiff(arr,m,n)); 

	}

	private static int findMinDiff (int[] arr, int m, int n) {

		if(m==0|| n==0)
			return 0;
		Arrays.sort(arr);
		if(m>n)
			return -1;
		
		int first=0,last=0;
		int min_diff=Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++){
			int diff=arr[i+m-1]-arr[i];
			if(diff<min_diff)
			{
				min_diff=diff;
				 first=i;
				 last=i+m-1;
			}
		}
		return arr[last]-arr[first];
		
	}

}
