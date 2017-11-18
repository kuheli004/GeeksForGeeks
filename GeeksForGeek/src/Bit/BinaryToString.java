package Bit;

public class BinaryToString {

	public static void main(String[] args) {
		double d=4.47;
		int k=3;
	System.out.println(printBinary(d, k));

	}

	private static String  printBinary(double num,int k) {

		StringBuilder binary=new StringBuilder();
		int Integral=(int) num;
		double fractional=num-Integral;
		while(Integral>0) {
			int rem=Integral%2;
			binary.append(rem);
			Integral/=2;
		}
		binary=binary.reverse();
		binary.append(".");
		while(k-->0) {
			fractional*=2;
			int fract_bit=(int) fractional;
			if(fract_bit==1) {
				fractional-=fract_bit;
				binary.append("1");
				
			}
			else
				binary.append("0");	
		}
	
			return binary.toString();
	}

}
