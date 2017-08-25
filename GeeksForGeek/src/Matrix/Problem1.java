package Matrix;

public class Problem1 {

	public static void main(String[] args) {
		 int[][]  mat= { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
		 String index=search(mat,4,29);
		 System.out.println(index);
	}

	private static String   search(int[][] mat, int n, int x) {
		int i=0,j=n-1;
		String index="";
		while(j>=0 && i<n){
			if(mat[i][j]>x)
				j--;
			else if(mat[i][j]<x)
				i++;
			else if(mat[i][j]==x){
				index=i+","+j;
				break;
			}
			else
				index="Not found";
		}
		return index;
			
	}

}
