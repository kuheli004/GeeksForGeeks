package Bit;

public class ConvertAToB {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println(getNoOfBitsFlip(a^b));

	}

	private static int getNoOfBitsFlip(int n) {
		int count=0;
		while(n!=0)
		{
			count+=n&1;
			n>>=1;
		}
		return count;
	}

}
