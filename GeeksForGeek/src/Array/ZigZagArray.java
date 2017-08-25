package Array;

import java.util.Arrays;

public class ZigZagArray {

	public static void main(String[] args) {
	int arr[]={1, 2,3,4};
	Zigzag(arr);
	System.out.println(Arrays.toString(arr));

	}

	private static void Zigzag(int[] arr) {
		boolean flag=true;
		int n=arr.length;
		int temp=0;
		for(int i=0;i<=n-2;i++){
			if(flag){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else
			{
				if(arr[i]<arr[i+1])
				{	temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
					
				}
			}
			flag=!flag;
		}
		
	}

}
