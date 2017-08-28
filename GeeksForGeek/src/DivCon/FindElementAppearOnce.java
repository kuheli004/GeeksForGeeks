package DivCon;

public class FindElementAppearOnce {

	public static void main(String[] args) {
		int arr[]= {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
		Search(arr,0,arr.length-1);
	}

	private static void Search(int[] arr, int low, int high) {
		
		 if(low==high)
				System.out.println("the number is:"+arr[low]);
		
		int mid=(low+high)/2;
		if (low<high) {
		
			if(mid%2==0) {
				if(arr[mid]==arr[mid+1])
					Search(arr,mid+2,high);
				else
					Search(arr,low,mid);
			
			}
			else
			{
				if(arr[mid]==arr[mid-1])
					Search(arr,mid+1,high);
				else
					Search(arr,low,mid-1);
			}

			}
	
	}
		
		
}
