package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SwappingArraySum {

	public static void main(String[] args) {
		Integer arr1[]= {5, 7, 4, 6};	
		Integer arr2[]= {1, 2, 3, 8};
		
		int sum1=0,sum2=0;
		int m=arr1.length;
		int n=arr2.length;
		int i=0;
		for(i=0;i<m;i++) {
 			sum1+=arr1[i];
		}
		for(i=0;i<n;i++) {
			sum2+=arr2[i];
		}
		int diff=Math.abs(sum1-sum2)/2;
		if(m<=n) {
			Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr1));
			int j=0;
			while(j<n) {
				int total=diff+arr2[j];
				if(set.contains(total)) {
					System.out.println(total+" "+arr2[j]);
				
				break;
				}
				j++;
				
			}
			
			}
		else
		{
			Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr2));	
			int j=0;
			while(j<m) {
				int total=diff+arr1[j];
				if(set.contains(total)) {
					System.out.println(total+" "+arr1[j]);
				
				break;
				}
				j++;
				
			}
			
		}

	}

}
