package GreedyAlgo;

import java.util.Arrays;

public class Problem10 {

	public static void main(String[] args) {
		int arr[]={-2,0,5,-1,2};
		int k=4;
		int min=Integer.MAX_VALUE;
		int count=0,sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=0)
			count++;
			sum+=Math.abs(arr[i]);
		}
		if(count<=k)
			System.out.println(sum);
		if(count>k)
		{
			int noc=count%k;
			Arrays.sort(arr);
			for(int i=0;i<noc;i++){
			sum-=arr[i];
			}
		
		}

	}

}
