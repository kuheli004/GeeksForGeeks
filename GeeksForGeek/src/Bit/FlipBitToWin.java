package Bit;

import java.util.ArrayList;

public class FlipBitToWin {

	public static void main(String[] args) {
		int n=13;
		System.out.println(longestSequence(n));

	}

	private static int longestSequence(int n) {
		if(n==-1)
			return Integer.BYTES*8;
		
		int currLen=0,prevLen=0,maxLen=0;
		while(n!=0) {
			if((n&1)==1)
				currLen++;
			else if((n&1)==0){
				prevLen	=(n&2)==0?0:currLen;
				currLen=0;
			}
			maxLen=Math.max(prevLen+currLen,maxLen);
			n>>=1;
		}
		return maxLen+1;
	}



}
