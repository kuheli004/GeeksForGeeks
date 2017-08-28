package Bit;

public class RotateBits {

	public static void main(String[] args) {
		int n=8;
		int d=3	;
		System.out.println(leftRotate(n,d));

	}
	private static int leftRotate(int n, int d) {
		return (n << d | (n >> (Integer.SIZE - d)));
	}

}
