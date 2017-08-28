package Bit;

public class LongestConsecutive1s {

	public static void main(String[] args) {
		int n=14;
		System.out.println(getLongestConsecutive1s(n));
	}

	private static int getLongestConsecutive1s(int n) {
		int count=0;
	while(n!=0) {
		n=n&(n<<1);
		count++;
	}
	return count;
	}

}
