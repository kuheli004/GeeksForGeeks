package Array;

public class KthSmallNumber {

	public static void main(String[] args) {
		   int arr[] = {12, 3, 5, 7, 4, 19, 26};
		   int n=arr.length;
		   int k=2;
		   System.out.println(kthSmallest(arr,0,n-1,k));

	}
 
	private static int kthSmallest(int[] arr, int start, int end, int k) {
		int i=start;
		int j=end;
		if(start<end){
			int pivot=partition(arr,i,j);
			if(pivot==k-1)
				return arr[pivot];
			else if(pivot>k-1)
				return (kthSmallest(arr,i,pivot,k));
			else
				return kthSmallest(arr,pivot+1,j,k);
		}
		return -1;
	}

	private static int partition(int[] arr, int start, int end) {
	int pivot=start;
	int i=start+1;
	int j=end;
	int temp=0;
	while(i<j){
		while(arr[i]<=arr[pivot] && i<end)
			i++;
		while(arr[j]>=arr[pivot] && j>start)
			j--;
		if(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
	temp=arr[pivot];
	arr[pivot]=arr[j];
	arr[j]=temp;
	
	return j;
	}

}
