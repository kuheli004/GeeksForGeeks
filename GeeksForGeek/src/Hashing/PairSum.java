package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {
	
	
	public static void main(String[] args) {
		Integer arr[]= {1,1,1,1};
		int sum=2;
		System.out.println(NoofPair(arr,sum));
	}
	private static int NoofPair(Integer[] arr, int sum) {
			
		int count=0;
		int n=arr.length;
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],0);
			hm.put(arr[i], hm.get(arr[i])+1);
		}
		for(int i=0;i<n;i++) {
			count+=hm.get(sum-arr[i]);
			
			if((sum-arr[i])==arr[i])
				count--;
		}
		
		return count/2;

		
	}

}
