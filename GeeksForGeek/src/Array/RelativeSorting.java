package Array;

import java.util.Arrays;

public class RelativeSorting {

	public static void main(String[] args) {
		int arr1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	    int arr2[] = {2, 1, 8, 3};
	    int m=arr1.length;
	    int n=arr2.length;
	    sortAccording(arr1,arr2, m, n);
	    PrintArray(arr1,m);

	}

	private static void PrintArray(int[] arr1, int m) {
		
		for(int i=0;i<m;i++){
		System.out.print(arr1[i]+" ");
		}
			
	}

	private static void sortAccording(int[] arr1, int[] arr2, int m, int n) {
		int temp[]=new int[m];
		int visited[]=new int[m];
		for(int i=0;i<m;i++){
			temp[i]=arr1[i];
			visited[i]=0;
		}
		Arrays.sort(temp);
		int ind=0;
		for(int i=0;i<n;i++){
			int f=first(temp, 0, m-1, arr2[i], m);
			if(f==-1)
				continue;
		for(int j=f;(j<m && temp[j]==arr2[i]);j++){
			arr1[ind++]=temp[j];
			visited[j]=1;
			}
	
		}
	    for (int i=0; i<m; i++)
	        if (visited[i] == 0)
	            arr1[ind++] = temp[i];
	}

	private static int first(int[] arr, int low, int high, int x, int n) {
		  if (high >= low)
		    {
		        int mid = low + (high-low)/2;  /* (low + high)/2; */
		        if ((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
		            return mid;
		        if (x > arr[mid])
		            return first(arr, (mid + 1), high, x, n);
		        return first(arr, low, (mid -1), x, n);
		    }
		    return -1;
	}
	}
