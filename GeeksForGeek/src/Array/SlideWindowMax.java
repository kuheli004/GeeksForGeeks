package Array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SlideWindowMax {

	public static void main(String[] args) {
	int arr[]={12, 1, 78, 90, 57, 89, 56};
	int k=3;	
	int i=0,n=arr.length;
		Deque<Integer> q=new LinkedList();
		
		for( i=0;i<k;i++){
			while(!q.isEmpty()&& arr[i]>=arr[q.peekLast()])
				q.removeLast();
			q.addLast(i);
		}
		for(;i<n;i++){
			System.out.print(arr[q.peek()]+" ");
		    while((!q.isEmpty()) && q.peek() <= i-k)
                q.removeFirst();
             
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while((!q.isEmpty()) && arr[i] >= arr[q.peekLast()])
                q.removeLast();
             
 
            // Add current element at the rear of Qi
            q.addLast(i);
		}
		System.out.print(arr[q.peek()]+" ");
	}
	

}
