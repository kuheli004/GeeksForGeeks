package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateIPAddr {

	public static void main(String[] args) {
		String str = new String("11211");
		System.out.println("All valid combinations are: \n");
		int[] arr = new int[3];
		printValidIP(str,0,str.length()-1,4,arr);
	}
	
	//Utility function
	private static long intVal(String str,int start,int end){
		String my = new String(str.substring(start,end+1));
		return Long.parseLong(my);
	}

	
	private static void printValidIP(String str,int start,int end,int partsLeft,int dotIndexArray[]) {
		
		//If at any point start>end, no need to print anything
		if(start>end){
			return;
		}
		
		//The base case when only one last part of IP is remaining
		if(partsLeft == 1){
			if(intVal(str,start, end) <= 255){
				//This is a valid combination, print it
				System.out.println("One valid ip is: "+str.substring(0, dotIndexArray[0]+1)+'.'+str.substring(dotIndexArray[0]+1, dotIndexArray[1]+1)+'.'+str.substring(dotIndexArray[1]+1, dotIndexArray[2]+1)+'.'+str.substring(dotIndexArray[2]+1, end+1));
				return;
			}
			return;
		}
		
		
		for(int i = start;i<=end;i++){
			if(intVal(str,start,i) <= 255){
				dotIndexArray[4-partsLeft] = i;
				printValidIP(str,i+1,end,partsLeft-1,dotIndexArray);
			}	
			else{
				break;
			}
		}
		return;
	}
}
