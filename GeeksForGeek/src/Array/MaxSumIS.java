package Array;

import java.util.Arrays;

public class MaxSumIS {

	public static void main(String[] args) {
		int arr[] = {1, 101, 2, 3, 100, 4, 5};
		int i,j,max=0,n=arr.length;
		int ms[]=new int[n];
		for(i=0;i<n;i++)
			ms[i]=arr[i];
		for(i=1;i<n;i++){
			for(j=0;j<i;j++){
				if((arr[j]<arr[i])&& (ms[i]<ms[j]+arr[i]))
					ms[i]=ms[j]+arr[i];
			}
		}
		for(i=0;i<n;i++){
			if(ms[i]>max)
				max=ms[i];
		}
		System.out.println(Arrays.toString(ms));
		System.out.println(max);
	}

}
