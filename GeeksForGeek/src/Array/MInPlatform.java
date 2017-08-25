package Array;

import java.util.Arrays;

public class MInPlatform {

	public static void main(String[] args) {
	int arv[]={900,940,950,1100,1500,1800};
	int dept[]={910,1200,1120,1130,1900,2000};
	int dept2[]={910,1120,1130,1200,1900,2000};
	int n=arv.length;
	MinPlatForm(arv,dept,n);

	}

	private static void MinPlatForm(int[] arv, int[] dept, int n) {
		Arrays.sort(arv);
		Arrays.sort(dept);
		int min=Integer.MIN_VALUE;
		int count=0,i=0,j=0;
		while(i<n && j<n){
			if(arv[i]<dept[j]){
				i++;
				count++;
				if(count>min)
					min=count;
			}
			else{
				j++;
				count--;
			}
			
		}
	System.out.println(min);	
		
	}

}
