package GreedyAlgo;

import java.util.PriorityQueue;

public class Problem11 {

	public static void main(String[] args) {
	int arr[]={-2,0,5,-1,2};
	int k=3;
	int sum=0;
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	for(int x:arr)
		pq.add(x);
	//System.out.println(pq);
	while(k-->0){
		int tmp=pq.poll();
		tmp*=-1;
		pq.add(tmp);
		
	}
	for(int x:pq)
	sum+=x;
	
	System.out.println(sum);

	}

}
