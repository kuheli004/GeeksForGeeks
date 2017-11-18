package Bit;

public class CountSetBits {
 
	public static void main(String[] args) {
		int n=4;
		System.out.println(CountSetBits(n));
	}

	private static int CountSetBits(int n) {
		int bit_count=0;
		for(int i=1;i<=n;i++) {
			bit_count+=countSetBitsUtil(i);
		}
		return bit_count;
	}
	

	private static int countSetBitsUtil(int x) {
		if(x<=0)
		return 0;
		return (x %2 == 0? 0: 1) + countSetBitsUtil (x/2);
	}

}
