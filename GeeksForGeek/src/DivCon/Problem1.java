package DivCon;

public class Problem1 {

	public static void main(String[] args) {
	
		int x=2,n=8;
		int result=power(x,n);
		System.out.println(result);
	}

	private static int power(int x, int y) {
		if(y==0)
			return 1;
		 if(y%2==0)
		return	power(x,y/2)*power(x,y/2);
		 else
				return	2*power(x,y/2)*power(x,y/2);	 
	}

	
}
