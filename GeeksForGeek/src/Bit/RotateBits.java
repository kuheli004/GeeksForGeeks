package Bit;

public class RotateBits {

	public static void main(String[] args) {
		int n=16;
		int d=2	;
		System.out.println(leftRotate(n,d));
		System.out.println(rightRotate(n,d));

	}
	private static int  rightRotate(int n, int d) {
		System.out.println(Integer.toBinaryString(n << (Integer.SIZE - d)));
		return (n >> d | (n << (Integer.SIZE - d)));
	}
	private static int leftRotate(int n, int d) {
		return (n << d | (n >>(Integer.SIZE - d)));
	}

}
