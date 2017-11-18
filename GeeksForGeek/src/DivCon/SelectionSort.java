package DivCon;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {38,27,43,3,9,82,10};
		int n=arr.length;
		SelectionSort(arr,n);
	System.out.println(Arrays.toString(arr));
	}

	private static void SelectionSort(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}
}
