package Array;

public class EqulibriumPoint {

		static int arr[]={1,3,6,5,10};
	public static void main(String[] args) {
		int total=0,curr_sum=0,j=0;
		int n=arr.length;
		for(int i=0;i<arr.length;i++){
			total+=arr[i];
		}
		while(j<n){
			if(2*curr_sum+arr[j]==total)
				break;
			
			curr_sum+=arr[j];
			j++;
		}
		System.out.println("equilibrium point:::"+(j+1));

	}

}
