package String;

public class StringPermutation {

	public static void main(String[] args) {
		Permutation("ABSG");
		
	}

	private static void Permutation(String input) {
		Permuation("",input);
		
	}

	private static void Permuation(String str1, String str2) {
		if(str2.isEmpty())
			System.out.print((str1+str2)+" ");
		else
		{
			for(int i=0;i<str2.length();i++){
				Permuation(str1+str2.charAt(i),str2.substring(0,i)+str2.substring(i+1));
			}
		}
			
		
	}

}
