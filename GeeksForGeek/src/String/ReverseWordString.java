package String;

public class ReverseWordString {

	public static void main(String[] args) {
		String str="i.like.this.program.very.much";
		System.out.println(ReverseArray(str));
		

	}

	private static String ReverseArray(String str) {
		if(str.indexOf(".")!=-1){
			str=str.substring(str.lastIndexOf(".")+1)+"."+ReverseArray(str.substring(0,str.lastIndexOf(".")));
		}
			return str; 
		
	}

}
