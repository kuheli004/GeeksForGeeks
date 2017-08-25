package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequencySorting {
static Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
static Integer arr[]={2, 3, 2, 7, 5, 12, 2, 3, 3, 3, 12};
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++){
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i], 1);
			else
				hm.put(arr[i], hm.get(arr[i])+1);
		}
		  Arrays.sort(arr, new SizeComperator());
		
		  System.out.println(Arrays.toString(arr));
	}

}
class SizeComperator implements Comparator<Integer>{

	public int compare(Integer a,Integer b) {
		int x=FrequencySorting.hm.get(a);
		int y=FrequencySorting.hm.get(b);
		if(x==y)
			return (a-b);
		else
			return (y-x);
	}
	
}
