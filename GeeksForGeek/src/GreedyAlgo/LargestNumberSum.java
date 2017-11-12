package GreedyAlgo;

public class LargestNumberSum {

	public static void main(String[] args) {
	int s=20,d=5;
	System.out.println(LargestSum(s,d));

	}

	private static int  LargestSum(int s, int d) {
		int sum=s;
		int t=0;
		int num=0;
		if(sum<=9 && d==2)
		num=sum*10+0;
		else if(sum<=9 && d==1)
			num=sum;
		else {
			
			int i=9;
			while(d-->0 && t<=sum) {
				
				int diff=sum-t;
				if(diff==0) {
					num=num*10;
				}
				else if(diff<9)
				{
					num=num*10+diff;
					t+=diff;
				}
				else
				{
					num=num*10+i;
					t+=i;
				}
				
			}
		}
			
		

		return num;
	}

}
