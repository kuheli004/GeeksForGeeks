package Matrix;

public class Problem5 {
	static int R=4;
	static int C=4;
	public static void main(String[] args) {
		  int  mat[][] = { {0, 0, 0, 1},
			        	   {0, 1, 1, 1},
			               {1, 1, 1, 1},
			               {0, 0, 0, 0}
			    };
		 // System.out.println( rowWithMax1s(mat));
		  System.out.println( rowWithMax1sTwo(mat));
	}

	private static int rowWithMax1sTwo(int[][] mat) {
		int max_row_index=0;
		int j=first(mat[0],0,C-1);
		if(j==-1)
			j=C-1;
		for(int i=1;i<R;i++){
			while(j>=0 && mat[i][j]==1)
			{
				j=j-1;
				max_row_index=i;
			}
		}
		return max_row_index;
	}

	private static int  rowWithMax1s(int[][] mat) {
		int max_row_index=0,max=-1;
		int index;
		for(int i=0;i<R;i++){
			index=first(mat[i],0,C-1);
			if(index!=-1&& C-index>index)
			{
				max=C-index;
				max_row_index=i;
			}
		}
		return max_row_index;
		 
	}

	private static int first(int[] arr, int low, int high) {
		if(high>=low){
		int mid=low+(high-low)/2;
		if((mid==0 || arr[mid-1]==0)&&arr[mid]==1)
			return mid;
		else if(arr[mid]==0)
			return first(arr,mid+1,high);
		else
			return first(arr,low,mid-1);
			
		}
		return -1;
	}

}
