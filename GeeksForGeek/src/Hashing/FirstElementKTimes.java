package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstElementKTimes {

	public static void main(String[] args) {	
	    int arr[] = {1, 7, 4, 3, 4, 8, 7};
	    int k=2;
	    int index=firstElement(arr,k);
        System.out.println("firstElement:: "
                           + arr[index]);
	}

	private static int firstElement(int[] arr, int k) {
	
		int min=Integer.MAX_VALUE;

		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
		if(map.get(arr[i]) == null){
		map.put(arr[i],1);
		map2.put(arr[i], i);
		}
		else{

		int tmp = map.get(arr[i])+1;
		if(tmp == k){

		min=Math.min(min, map2.get(arr[i]));

		}

		map.put(arr[i],tmp);

		}
		}

		return min;
		
		}
	}
