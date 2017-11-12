package GreedyAlgo;

public class MinimumCoinRequired {

	public static void main(String[] args) {
		int coin[]= { 1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int total=1003;
		int sum=0;
		int n=coin.length;
		int i=0;
		while(sum!=total) {
			int count=0;
			if(total>=coin[n-1]) {
				count=total/coin[n-1];
				total%=coin[n-1];
				System.out.println(coin[n-1]+" "+count);
			}
			else {
				for(i=n-1;i>=0;i--) {
					if(coin[i]<=total) {
						count=total/coin[i];
						total%=coin[i];
					System.out.println(coin[i]+" "+count);
					}
				}
				n=i;
			}
			
				
		}

	}

}
