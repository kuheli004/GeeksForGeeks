package DynamicProgramming;

public class LongestIncreasingSubsequnces {

	public static void main(String[] args) {
		  int arr[] = {50, 3, 10, 7, 40, 80 };
          int n = arr.length;
          System.out.println("Length of lis is " + lis( arr, n ) );

	}

	private static int lis(int[] arr, int n) {
	int lis[]=new int[n];
	
	for(int i=0;i<n;i++)
		lis[i]=1;
	
	for(int i=1;i<n;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i]>arr[j] && lis[i]<lis[j]+1)
				lis[i]=lis[j]+1;
		}
	}
	
	int max=Integer.MIN_VALUE;
	for(int i=0;i<n;i++)
	{
		if(lis[i]>max)
			max=lis[i];
	}
		return max;
	}

}
