package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstElementKTimes {

	public static void main(String[] args) {	
	    int arr[] = {1, 7, 4, 3, 4, 8, 7};
	    int k=2;
        System.out.println("firstElement:: "
                           + firstElement(arr,k));
	}

	private static int firstElement(int[] arr, int k) {
	
		ArrayList<Integer> found = new ArrayList<>();

		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
		if(map.get(arr[i]) == null){
		map.put(arr[i],1);
		}
		else{

		int tmp = map.get(arr[i])+1;
		if(tmp == k){

		found.add(arr[i]);

		}

		map.put(arr[i],tmp);

		}
		}

		return found.get(1);
		}
	}
