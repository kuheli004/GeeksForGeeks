package Hashing;

import java.util.Arrays;

public class ArraySubSetOfArray {

	public static void main(String[] args) {
		int arr1[]= {10,5, 2, 23, 19};
		int arr2[]= {19 ,5 ,3};
		System.out.println(isSubSet(arr1,arr2));
	
		
	}

	private static boolean isSubSet(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<n && j<m) {
			if(arr2[j]>arr1[i])
				i++;
			else if(arr2[j]<arr1[i])
				j++;
			else if(arr1[i]==arr2[j]) {
				i++;
				j++;
			}
		}
		return true;
	}

}
