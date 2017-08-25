package String;

public class StrStrFunc {

	public static void main(String[] args) {
		String str="abcd";
		String str2="bd";
		System.out.println(IndexOfFunc(str,str2));
		
	}

	private static int IndexOfFunc(String str, String str2) {
		int len=str.length();
		int sublen=str2.length();
		int s1=0,s2=0,pos=-1;
		while(s1<len){
			if(str.charAt(s1)==str2.charAt(s2)){
				s1++;
				s2++;
			}
			else{
				s1++;
				s2=0;
			}
			 if(s2==sublen){
				  pos=s1-s2;
				  break;
			 }
		}
		return pos;
		
	}

}
