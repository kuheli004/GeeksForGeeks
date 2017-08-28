package Bit;

public class SetKthBit {

	public static void main(String[] args) {
		int n=10,k=2;
		System.out.println(getKthBitSet(n,k));


	}

	private static int getKthBitSet(int n, int k) {
		
		return (n |(k<<1));
	}

}
