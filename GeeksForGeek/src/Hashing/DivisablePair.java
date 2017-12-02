package Hashing;

import java.util.HashMap;

public class DivisablePair {
	static HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	public static void main(String[] args) {	
		  int arr[] = { 91, 74, 66, 48 };
 	        int k = 10;
	        boolean ans = canPairs(arr, k);
	        if (ans)
	            System.out.println("True");
	        else
	            System.out.println("False");
	}

	private static boolean canPairs(int[] arr, int k) {
		int n=arr.length;
		if(n%2!=0)
			return false;
		for(int i=0;i<n;i++) {
			int rem=arr[i]%k;
			if(!hm.containsKey(rem)) {
				hm.put(rem,0);
			}
			hm.put(rem,hm.get(rem)+1);
		}
		for(int i=0;i<n;i++) {
			int rem=arr[i]%k;
			if(2*rem==k) {
				if(hm.get(rem)%2==1)
					return false;
			}
			else if(rem==0) {
				if(hm.get(rem)%2==1)
					return false;
			}
			else if(hm.get(rem)!=hm.get(k-rem))
				return false;
		}
		return true;
	}
}
