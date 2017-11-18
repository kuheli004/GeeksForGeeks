package String;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Permutation(str);
		
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
