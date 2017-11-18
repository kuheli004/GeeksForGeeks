package DivCon;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {38,27,43,3,9,82,10};
		int n=arr.length;
		insertionSort(arr,n);
	System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr, int n) {
			for(int i=1;i<n;i++) {
				int val=arr[i];
				int j=i-1;
				while(j>=0 && val<arr[j]) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=val;
			}
		
	}

}
