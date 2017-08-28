package Bit;

public class AloneInCouple {

	public static void main(String[] args) {
		int arr[]= {1,3,3,1,2};
		int n=arr.length;
		System.out.println(getTheSingle(arr,n));
	}

	private static int getTheSingle(int[] arr, int n) {
		int x=0;
		for(int i=0;i<n;i++) {
			x=x^arr[i];
		}
		
		return x;
	}

}
