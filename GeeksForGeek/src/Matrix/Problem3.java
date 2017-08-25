package Matrix;

public class Problem3 {
	static int R=3;
	static int C=4;
	public static void main(String[] args) {
		
		 int mat[][] = { {1, 0, 0, 1},
			        	 {0, 0, 1, 0},
			        	 {0, 0, 0, 0},
			    };
		   System.out.println("Input Matrix \n");
		    printMatrix(mat);
		 
		    modifyMatrix(mat);
		 
		    System.out.println("Matrix after modification \n");
		    printMatrix(mat);
	}

	private static void modifyMatrix(int[][] mat) {
	int row[]=new int[R];
	int col[]=new int[C];
		 
		for(int i=0;i<R;i++)
		{
			row[i]=0;
		}
		for(int j=0;j<C;j++)
		{
			col[j]=0;
		}
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++)
			{
				if(mat[i][j]==1)
				{
					row[i]=1;
					col[j]=1;
				}
			}
			
		}
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++)
			{
				if(row[i]==1 || col[j]==1)
				{
					mat[i][j]=1;
				}
			}
			
		}

	}

	private static void printMatrix(int[][] mat) {
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
