package DynamicProgramming;

public class EggDroppingProblem {

	public static void main(String[] args) {
		 int n = 2, k = 36;
	        System.out.println("Minimum number of trials in worst case with "+n+"  eggs and "+k+
	                 " floors is "+eggDrop(n, k));   

	}

	private static int eggDrop(int n, int k) {
			int eggFloor[][]=new int [n+1][k+1];
			int res=0;
			for(int i=1;i<=n;i++) {
				eggFloor[i][1]=1;
				eggFloor[i][0]=0;
			}
			for(int j=1;j<=k;j++)
				eggFloor[1][j]=j;
			for(int i=2;i<=n;i++)
			{
				for(int j=2;j<=k;j++) {
					eggFloor[i][j]=Integer.MAX_VALUE;
					for(int x=1;x<=j;x++) {
						res=1+Math.max(eggFloor[i-1][x-1],eggFloor[i][j-x]);
						if(res<eggFloor[i][j])
						eggFloor[i][j]=res;
						
					}
				/*	if(j==0||j==1)
						eggFloor[i][j]=j;
					else if(i==1)
						eggFloor[i][j]=j;*/
				}
			}
			return eggFloor[n][k];
	}

}
