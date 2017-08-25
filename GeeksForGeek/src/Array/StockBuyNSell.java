package Array;

public class StockBuyNSell {
	static  int price[] = {100, 180, 260, 310, 40, 535, 695};
	public static void main(String[] args) {
		
		  int n=price.length;
		  stockBuySell(price, n);

	}

	private static void stockBuySell(int[] price, int n) {
		int count=0,p=0,k=0;
		for(int i=0;i<n-1;i+=p){
			int buy=price[i];
			p=0;
			int max_sell=Integer.MIN_VALUE;
			for(k=i+1;k<n;k++){
				int sell=price[k];
				p++;
				if(sell>buy && sell >max_sell)
					max_sell=sell;
				else if(sell<buy)
				{
					break;
				}
				
			}
			System.out.println("Buy:::"+i+"  Sell:::"+(k-1));
		}
	}

}
