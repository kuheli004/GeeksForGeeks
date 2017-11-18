package DivCon;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {38,27,43,3,9,82,10};
		int n=arr.length;
		bubbleSort(arr,n);
	System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr, int n) {
		
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag)
				break;
		}
	}

}
