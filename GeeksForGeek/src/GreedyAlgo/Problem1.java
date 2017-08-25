package GreedyAlgo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem1 {

	public static void main(String[] args) {
	int arr[]={6, 8, 4, 5, 2, 3};
	int n=arr.length;
	long sum=minsum(arr,n);
	System.out.print(sum);
	}

	private static long minsum(int[] a, int n) {
		TreeSet<Integer> pq = new TreeSet<Integer>();

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
 
     
        for (int x : a)
            pq.add(x);
 
       System.out.println(pq);
     Iterator<Integer> it=pq.iterator();
     while(it.hasNext()){
    	   num1.append(it.next());
    	   if(it.hasNext())
    	   num2.append(it.next());
    	   System.out.println(num1+" ::"+num2);
       }
      /*  while (!pq.isEmpty())
        {
            num1.append(pq.g()+ "");
            if (!pq.isEmpty())
                num2.append(pq.poll()+ "");
            
           System.out.println(num1+" ::"+num2);
        }*/
 
        // the required sum calculated
        long sum = Long.parseLong(num1.toString()) +
                   Long.parseLong(num2.toString());
 
        return sum;
	}

}
