package Bit;

public class SwapEvenOddBit {

	public static void main(String[] args) {
		int x=23;
		System.out.println(swapBits(x));

	}

	private static int swapBits(int x) {
		int even_bit=x & 0xAAAAAAAA;
		int odd_bit= x & 0x55555555;
		even_bit>>=1;
		odd_bit<<=1;
		
		return (even_bit|odd_bit);
	}

}
