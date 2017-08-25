package Array;

import java.util.HashMap;
import java.util.Map;

public class SumSubArray {
	static int  arr[]={15, 2, 10, 8, 9, 5, 10, 23};
	static int  arr2[]={1, 4, 20, 3, 10, 5};
	public static void main(String[] args) {
	//sumSubArr(arr,27);
	sumSubArrMap(arr2,18,6);
	}
	private static void sumSubArrMap(int[] arr,int sum, int n) {
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int curr_sum=0;
		for(int i=0;i<n;i++){
			curr_sum=curr_sum+arr[i];
			if(curr_sum==sum){
				System.out.println("Sum found between index 0 to "+i);
				break;
			}
			if(hm.containsKey(curr_sum - sum)){
				int p=hm.get(curr_sum - sum);
				System.out.println("Sum found between index "+(p+1)+" to "+i);
				break;
				}
		hm.put(curr_sum,i);		}
		
	}
	private static void sumSubArr(int[] arr2,int sum) {
		int curr_sum=arr[0],start=0,i;
		int n=arr.length;
			for(i=1;i<n;i++){
				while(curr_sum>sum && start <i-1){
					curr_sum=curr_sum-arr[start];
					start++;
				}
				if(curr_sum==sum){
					int p=i-1;
					System.out.println("sum found between indexs "+start
							+" and "+p);
					break;
				}
				if(i<n)
				     curr_sum = curr_sum + arr[i];
			}
	}

}
