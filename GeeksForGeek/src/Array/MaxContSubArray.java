package Array;

public class MaxContSubArray {
	static int  arr[]={-2,-3,4,-1,-2,1,5,-3};
	public static void main(String[] args) {
		System.out.println(MaxSubArraySum(arr));

	}
	private static int MaxSubArraySum(int[] arr) {
	
		int max_so_far=Integer.MIN_VALUE,max_end_here=0;
		for(int i=0;i<arr.length;i++){
		
				max_end_here+=arr[i];
			
			
				if(	max_end_here>max_so_far)
					max_so_far=max_end_here;
				
				if(max_end_here<0)
					max_end_here=0;
		}
		
		return max_so_far ;
	}

}
