package Matrix;

public class Problem4 {
	static int R=6;
	static int C=5;
	public static void main(String[] args) {
		int M[][] = {{0, 1, 1, 0, 1}, 
					{1, 1, 0, 1, 0}, 
					{0, 1, 1, 1, 0},
					{1, 1, 1, 1, 0},
					{1, 1, 1, 1, 1},
					{0, 0, 0, 0, 0}};
             
			printMaxSubSquare(M);

	}

	private static void printMaxSubSquare(int[][] m) {
		int S[][]= new int[R][C];
	
		for(int i=0;i<R;i++){
			S[i][0]=m[i][0];
		}
		for(int i=0;i<C;i++){
			S[0][i]=m[0][i];
		}
		int max=S[0][0];
		for(int i=1;i<R;i++){
			for(int j=1;j<C;j++){
				if(m[i][j]==1)
				S[i][j]=min(S[i][j-1],S[i-1][j],S[i-1][j-1])+1;
				else
					S[i][j]=0;
			}
		}
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(S[i][j]>max)
					max=S[i][j];
			}
		}
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				System.out.print(S[i][j]+"");
				
			}
			System.out.println();
		}
		System.out.println(max);
	}

	private static int min(int i, int j, int k) {
	/* if(i<=j && i<=k)
		 return i;
	 else if(j<=k && j <=i)return j;
	 else
		 return k;*/
		int m=Math.min(i,j);
		m=Math.min(m, k);
		return m;
	}

}
