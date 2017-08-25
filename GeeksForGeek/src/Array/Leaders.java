package Array;

public class Leaders {

	public static void main(String[] args) {
		int arr[]={16 ,17 ,4 ,3 ,5 ,2};
		int n=arr.length;
		//LeaderNum(arr,n);
		LeaderNumEffcient(arr,n);

	}

	private static void LeaderNumEffcient(int[] arr, int n) {
		int max=arr[n-1];
		System.out.print(max+" ");
		for(int i=n-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	private static void LeaderNum(int[] arr, int n) {
		for(int i=0;i<n-1;i++){
			int j=i+1;
			boolean flag=true;
			while(j<n){
			if(arr[i]>arr[j]){
				j++;
			}
			else{
				flag=false;
				break;
			}
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
		System.out.print(arr[n-1]);
	}

}
