package Bit;

public class KthBitSet {

	public static void main(String[] args) {
		int n=5,k=1;
		System.out.println(isKthBitSet(n,k));

	}

	private static String isKthBitSet(int n, int k) {
		// TODO Auto-generated method stub
		return ((n&(1<<(k-1)))==1)?"SET":"NOT SET";
	}

}
      