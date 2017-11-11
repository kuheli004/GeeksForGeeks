package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnSorted {

	public static void main(String[] args) {
		  Activity arr[] = {new Activity(5,9),new Activity(1,2),
				  			new Activity(3,4),new Activity(0,6),
				  			new Activity(5,7),new Activity(8,9)};
		  int n = arr.length;
		  printMaxActivities(arr, n);
		

	}

	private static void printMaxActivities(Activity[] arr, int n) {
	Activity act=new Activity();
	Arrays.sort(arr,act);
	System.out.println(Arrays.toString(arr));
	int i=0;
	System.out.println(arr[i]+" ");
	for(int j=1;j<n;j++) {
		if(arr[j].start> arr[i].finish) {
			System.out.println(arr[j]+" ");
			i=j;
		}
		
		
	}
			
		
		
	}

}
class Activity implements Comparator{
	public int start,finish;
	public Activity() {
		
	}
	public Activity(int start, int finish) {
		super();
		this.start = start;
		this.finish = finish;
	}

	@Override
	public int compare(Object ob1, Object ob2) {
		
		Activity s1=(Activity)ob1;
		Activity s2=(Activity)ob2;
		if(s1.finish<s2.finish)
			return -1;
		else
			return 0;
	}
	public String toString() {
		return "("+start+","+finish+")";
	}
	
	
}
