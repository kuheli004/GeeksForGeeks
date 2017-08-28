package GreedyAlgo;

public class MinOperation {

	public static void main(String[] args) {
		int first=4,second=7;
		System.out.println(findMinOperation(first,second));

	}

	private static int findMinOperation(int first, int second) {
		int count = -1;

		if(first<1 || second<1){
		return count;
		}

		if(first>second){
		return first-second;
		}else if(second%first==0){
		int temp = second/first;
		while(temp>0){
		temp = temp>>1;
		count++;
		}
		return count;
		}else{
		int temp =first;
		count = 0;
		while(temp<second){ temp="temp&lt;&lt;1;" count++;}
		if(temp="=second){" return="" count;="" }="" if(temp="">second){
		return count+(temp-second);
		}
		}
		return count;
	}

}
