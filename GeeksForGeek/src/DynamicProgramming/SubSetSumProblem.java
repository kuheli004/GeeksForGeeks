package DynamicProgramming;

public class SubSetSumProblem {

	public static void main(String[] args) {

        int arr1[] = {2, 3, 7, 8};
        System.out.print(subsetSum(arr1, 11));
	}

	private static boolean subsetSum(int[] arr1, int total) {
		  boolean T[][] = new   boolean[arr1.length+1][total+1];
		  for(int i=0;i<=arr1.length;i++)
			  T[i][0]=true;
		  
	      for (int i = 1; i <= arr1.length; i++) {
	            for (int j = 1; j <= total; j++) {
	            	if(j<arr1[i-1])
	            		T[i][j]=T[i-1][j];
	            	else
	            		T[i][j]=T[i-1][j]|| T[i-1][j-arr1[i-1]];	
	            }
	}
	      return T[arr1.length][total];


	}
}
