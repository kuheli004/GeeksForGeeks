package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MaxSlidingWindow {
	static ArrayDeque<Integer> q=new ArrayDeque<Integer>();  

	public static void main(String[] args) {
		int arr[]={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k=4;
		int result[]=maxSlidingWindow(arr,k);
		//System.out.println(q);
		System.out.println(Arrays.toString(result));
	}

	private static int[] maxSlidingWindow(int[] arr, int k) {
		if(arr==null|| arr.length==0)
			return new int[0];
		int result[]=new int[arr.length-k+1];
		for(int i=0;i<arr.length;i++){
			
			/*  if(!q.isEmpty()&&q.peekFirst()==i-k) 
		            q.poll();*/
			while(!q.isEmpty()&& q.peekLast()<arr[i])
				q.removeLast();
			
			q.offer(arr[i]);
			if(i+1>=k)
				result[i+1-k]=q.peek();
			
		}
		return result;
		
	}

}
