package GreedyAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LRUCacheImpl {

	public static void main(String[] args) {
int pages[] = {5 ,0, 1, 3, 2, 4, 1, 0, 5};
        
        int capacity = 4;
         
        System.out.println(pageFaults(pages, pages.length, capacity));

	}

	private static int  pageFaults(int[] pages, int n, int capacity) {
		 
		HashSet<Integer> hs=new HashSet<Integer>();
		 
		HashMap<Integer,Integer> index=new HashMap<Integer,Integer>();
		int fault=0;
		 
		for(int i=0;i<n;i++)
		{
			if(hs.size()<capacity) {
				
				if(!hs.contains(pages[i])) {
					hs.add(pages[i]);
					index.put(pages[i],i);
					fault++;
				}
				index.put(pages[i],i);
				
				
			}
			else
			{
				if(!hs.contains(pages[i])) {
					Iterator it=hs.iterator();
					int LRU=Integer.MAX_VALUE,val=Integer.MIN_VALUE;
					 while(it.hasNext()) {
						 int temp=(int) it.next();
						 
						 if(index.get(temp)<LRU) {
							 LRU=index.get(temp);
							 val=temp;
						 }
					 }
					hs.remove(val);
					hs.add(pages[i]);
					fault++;
					
				}
				index.put(pages[i],i);
			}
				
		
		}
		 return fault;	
		}
}
