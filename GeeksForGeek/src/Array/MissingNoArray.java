package Array;

public class MissingNoArray {
	static int  arr[]={1,2,4,5};
	public static void main(String[] args) {
		int n_sum=(arr[3]*(arr[3]+1))/2;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(n_sum-sum);
	}

}
