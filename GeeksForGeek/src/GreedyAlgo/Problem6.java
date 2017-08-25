package GreedyAlgo;

import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		int arr[]={40,10,100,20};
		Arrays.sort(arr);
		int n=arr.length;
		int count=1;
		int low=arr[0];
		int sum=0;
		for(int i=1;i<n;i+=count){
			int j=0;
			count++;
			while(j<count){
				sum+=arr[i+j];
				j++;
			}
			
		}
		System.out.println(count);

	}

}
