package DivCon;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
	
		int arr[] = {2,4,1,3,5};
		  System.out.println(" Number of inversions are is::"+ mergeSort(arr, 5));;
		  System.out.println(Arrays.toString(arr));
	}

	private static int mergeSort(int[] arr, int n) {
		int tmp[]=new int[n];
		
		return mergeSort(arr,tmp,0,n-1);
	}

	private static int mergeSort(int[] arr, int[] tmp, int left, int right) {
		int mid=0,count=0;
		if(right>left){
			mid=(left+right)/2;
			count=mergeSort(arr,tmp,left,mid);
			count+=mergeSort(arr,tmp,mid+1,right);
			count+=merge(arr,tmp,left,mid+1,right);
			
			
		}
		return count;
	}

	private static int merge(int[] arr, int[] tmp, int left, int mid, int right) {
			int i,j,k,count=0;
			i=left;
			j=mid;
			k=left;
			System.out.println("left:::"+left+" right:::"+right);	

		
				while((i<=mid-1)&& (j<=right)){
				System.out.println("left:::"+left+" i:::"+i+"  mid:::"+mid+" j:::"+j+" right:::"+right);	
					if(arr[i]<=arr[j])
					{
						tmp[k++]=arr[i++];
								
					}
					else{
						tmp[k++]=arr[j++];
						count=count+(mid-i);				
					}
				}
				System.out.println(Arrays.toString(tmp));
						while(i<=mid-1){
						tmp[k++]=arr[i++];
						}
					while(j<=right){
						tmp[k++]=arr[j++];
					}
					for(i=left;i<=right;i++){
						arr[i]=tmp[i];
					}
					
					
					
				return count;
				}
	

}
