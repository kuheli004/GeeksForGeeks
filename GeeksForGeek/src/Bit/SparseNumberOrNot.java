package Bit;

public class SparseNumberOrNot {

	public static void main(String[] args) {
		System.out.println(checkSparse(12));
		System.out.println(checkSparse(72));

	}

	private static boolean  checkSparse(int i) {
		return ((i &(i>>1))==0? true:false);
	}

}
