package Bit;

public class PowerOfTwo {

	public static void main(String[] args) {
	int n=32;
	System.out.println(isPowerOfTwo(n)==1?"YES":"NO");
	System.out.println(isPowerOfTwoByMinus(n));
	}

	private static boolean isPowerOfTwoByMinus(int n) {
	 
		return(n!=0 &&(n&(n-1))==0);
	}

	private static int isPowerOfTwo(int n) {
		if(n==0)
			return 0;
		while(n!=1) {
			if(n%2!=0)
				return 0;
			else
				n=n/2;
		}
		return 1;
	}

}
