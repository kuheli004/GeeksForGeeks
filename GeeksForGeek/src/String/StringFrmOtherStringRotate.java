package String;

public class StringFrmOtherStringRotate {

	public static void main(String[] args) {
		 String str1 = "geeks";
	     String str2 = "eksge";
	     System.out.println(isRotated(str1,str2)?1:0);

	}

	private static boolean isRotated(String str1, String str2) {
		if(str1.length()!=str2.length())
			
		return false;
		int len=str1.length();
		String ClockWise="";
		String AntiClockWise="";
			
			ClockWise=ClockWise+str2.substring(2)+str2.substring(0,2);
		AntiClockWise=AntiClockWise+str2.substring(len-2)+str2.substring(0,len-2);
		
		return(str1.equals(ClockWise)||str1.equals(AntiClockWise));
	}

}
