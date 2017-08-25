package Matrix;

public class Problem7 {

	public static void main(String[] args) {
	int mat[][]={{-3, -2, -1,  1},
				 {-2,  2,  3,  4},
				 {4,   5,  7,  8}};
	System.out.println(countNegative(mat,3,4));

	}

	private static int  countNegative(int[][] mat, int m, int n) {
		int i=0;
		int j=n-1;
		int count=0;
		while(i<m && j>=0){
			if(mat[i][j]<0)
			{
				count+=(j+1);
				i+=1;
			}
			else
				j--;
		}
		return count;
		
	}

}
