package Bit;

public class FirstSetBit {

	public static void main(String[] args) {
		int n=4;
		System.out.println((int)getFirstRightBitSetLog(n)+1);
		System.out.println((int)getFirstRightBitSet(n));


	}

	private static int getFirstRightBitSet(int n) {
		int pos=0;
		while(n!=0) {
			pos++;
			if((n&1)==1)
				return pos;
			else
				n=n>>1;
		}
		return -1;
	}

	private static double getFirstRightBitSetLog(int n) {
		
		int a=n&(~n+1);
		Double d=Double.parseDouble(Integer.toBinaryString(a));
		
		return Math.log10(d);
	}

}
