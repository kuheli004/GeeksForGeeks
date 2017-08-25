package GreedyAlgo;

import java.util.Arrays;
import java.util.TreeSet;

public class Problem3 {
	public static void main(String args[]){
		int arr[]={10,12,15};
		int n=arr.length;
	
		int pos1=0,pos2=0,temp1=0,temp2=0,sum=0;
		Arrays.sort(arr);
		
		for(int i=0;i<n/2;i++)
		{
			sum-=2*arr[i];
			sum+=2*arr[n-i-1];
		}
		System.out.println(sum);
	}

}
