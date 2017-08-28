package Bit;

public class ToggleBitRange {
	public static void main(String[] args) {
	int n=17,l=2,r=3;
		
	System.out.println(getToggleBit(n,l,r));
	}

	private static int  getToggleBit(int n, int l, int r) {
		
		int num=(((1<<r)-1)^(1<<(l-1)-1));
		return (n^num);
	}
}
