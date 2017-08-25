package Matrix;

import java.util.Stack;

public class Problem8 {
	static int R=4;
	static int C=4;
	public static void main(String[] args) {
		int mat[][]= { {0, 1, 1, 0},
					   {1, 1, 1, 1},
                       {1, 1, 1, 1},
                       {1, 1, 0, 0}};
		
		System.out.println(maxRectangle(mat));

	}

	private static int maxRectangle(int[][] mat) {
		
		int result=maxHist(mat[0]);
		
		for(int i=1;i<R;i++){
			for(int j=0;j<C;j++){
				if(mat[i][j]==1)
					mat[i][j]+=mat[i-1][j];
			}
			result=Math.max(result,maxHist(mat[i]));
		}
		return result;
			
	}

	private static int maxHist(int[] row) {
	int min=Integer.MAX_VALUE;
	int i=0,count=0,area=0;
	
	while(i<C ){
		if(row[i]>0){
		if(row[i]<min)
			min=row[i];
			count++;
		}
		i++;
		
		
	
	}
	
	area=min*count;
		return area;
	

}
}