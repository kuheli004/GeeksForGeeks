package Hashing;

import java.util.HashMap;

public class LargestSubArrayZeroSum {

	public static void main(String[] args) {	
	    int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of the longest 0 sum subarray is "
                           + maxLen(arr));
	}

	private static int maxLen(int[] arr) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int n=arr.length;
		
		int sum=0,max_len=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			
			if(arr[i]==0 && max_len==0)
				max_len=1;
			if(sum==0)
				max_len=i+1;
			
			Integer prev_len=hm.get(sum);
			if(prev_len!=null)
				max_len=Math.max(max_len,i-prev_len);	
			else
				hm.put(sum,i);
				
		}
		return max_len;
	}

}
