package DivCon;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {10, 7, 8, 9, 1, 5};
		int n=arr.length;
		quickSort(arr,0,n-1);
	System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {
		int k=partition(arr,low,high);
		if(low<k)
		quickSort(arr,low,k-1);
		if(k<high)
		quickSort(arr,k+1,high);
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=low;
		int i=low+1;
		int j=high;
		while(i<=j) {
			
			while(i<=high && arr[i]<arr[pivot])
				i++;
			while(i>=low && arr[j]>arr[pivot])
				j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
			}
				
		}
		int temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		return j;
	}

}
