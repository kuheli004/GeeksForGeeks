package Bit;

public class RightMostDiffBit {

	public static void main(String[] args) {
		int m=52,n=4;
		System.out.println((int)getRightMostDiffBit(m^n)+1);

	}

	private static double getRightMostDiffBit(int n) {
		int a=n&(~n+1);
		Double d=Double.parseDouble(Integer.toBinaryString(a));
		
		return Math.log10(d);
	}

}
