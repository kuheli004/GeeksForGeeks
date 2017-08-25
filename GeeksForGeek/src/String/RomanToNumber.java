package String;

public class RomanToNumber {

	public static void main(String[] args) {
		String str="MCMIV";
		romanToDecimal(str);
		
	}

	private static void romanToDecimal(String str) {
		int number=0,s1=0,s2=0;
	for(int i=0;i<str.length();i++){
		 s1=value(str.charAt(i));
		if(i+1<str.length()){
		 s2=value(str.charAt(i+1));
			if(s1>=s2){
			number=number+(s1);
		}
		else{
			number=number+(s2-s1);
			i++;
		}
		}
		else
			number=number+s1;	

	}
		System.out.println(number);
		
	}

	private static int value(char r) {
		   if (r == 'I')
	            return 1;
	        if (r == 'V')
	            return 5;
	        if (r == 'X')
	            return 10;
	        if (r == 'L')
	            return 50;
	        if (r == 'C')
	            return 100;
	        if (r == 'D')
	            return 500;
	        if (r == 'M')
	            return 1000;
	        return -1;
	}	

}
