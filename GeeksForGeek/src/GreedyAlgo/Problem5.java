package GreedyAlgo;

import java.util.Arrays;

public class Problem5 {

	public static void main(String[] args) {
		int arr[]={7,6,9,2,1};
		int k=3;
		int temp=0;
		int n=arr.length;
		/*for(int i=k;i>0;i--){
			if(arr[i]<arr[i-1]){
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}*/
		  
      
      int pos=0;
      for(int i=0;i<n && k>0;i++)
          {
    	  int min=arr[i];
          for(int j=i+1;j<n;j++){
              if(arr[j]<min){
                  min=arr[j];
                  pos=j;
              }
          }
          if(min!=arr[i])
              {
               temp=arr[i];
              arr[i]=arr[pos];
              arr[pos]=temp;
          }
          k--;
          System.out.println(Arrays.toString(arr));
      }
			System.out.println(Arrays.toString(arr));
		}

	}


