package GreedyAlgo;

import java.util.Arrays;

public class Problem9 {

	public static void main(String[] args) {
		int coin[]={100,20,50,10,2,5};
		int n=coin.length;
		int k=3;
		int sum=0;
		Arrays.sort(coin);
		int noc=(int) Math.ceil((1.0*n)/(k+1));
		
		for(int i=0;i<noc;i++)
			sum+=coin[i];
		System.out.println(noc+"::"+sum);

	}

}
