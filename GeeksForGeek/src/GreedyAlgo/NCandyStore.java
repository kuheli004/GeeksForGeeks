package GreedyAlgo;

import java.util.Arrays;

public class NCandyStore {

	public static void main(String[] args) {
	int price[]= {3,2,1,4};
	int k=2;
	System.out.println(findMinAmount(price,k));
	System.out.println(findMaxAmount(price,k));
	
	}

	private static int findMaxAmount(int[] price, int k) {
		int sum=0;
		Arrays.sort(price);
		int n=price.length;
		int t=0;
		for(int i=n-1;i>=t;i--) {
			sum+=price[i];
			t+=k;
		}
		return sum;
	}

	private static int findMinAmount(int[] price, int k) {
		int sum=0;
		Arrays.sort(price);
		int n=price.length;
		int t=0;
		for(int i=0;i<n-t;i++) {
			sum+=price[i];
			t+=k;
		}
		return sum;
	}

}
