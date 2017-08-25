package GreedyAlgo;

import java.util.Scanner;

public class CoinPileProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,j=0;
		for( int t =0;t<n;t++) {
			int count=0;
			int p=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[p];
			for( j=0;j<p;j++) {
				a[j]=sc.nextInt();
			}
			for(i=0;i<p-1;i++) {
				int v=a[i];
				for( j=i+1;j<p;j++) {
				if(Math.abs(v-a[j])>k)
					{
					count+=(a[j]-v)-k;
						a[j]=Math.abs(v+k);
					}
				}
			}
			System.out.println(count);
		}

	}

}
