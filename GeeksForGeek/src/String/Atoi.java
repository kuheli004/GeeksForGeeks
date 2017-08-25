package String;

public class Atoi {

	public static void main(String[] args) {
		String str="-123";
		System.out.println(atoi(str));

	}

	private static int atoi(String str) {
		int rst=0;
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='-')
				flag=false;
			else
			{
				rst=rst*10+(str.charAt(i)-'0');
			}
		}
	
		return (flag)?rst:-rst;
	}

}
