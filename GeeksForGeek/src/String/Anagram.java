package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	static Map<Character,Integer> hm=new HashMap<Character,Integer>();	
	public static void main(String args[]){
		String str1="LGGTEN";
		String str2="SSLENT";
	//	System.out.println(checkAnangram(str1,str2));
		System.out.println(checkAnangramUsingSet(str1,str2));
	}

	private static boolean checkAnangramUsingSet(String str1, String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2)
			return false;
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		int count=0;
		for(int i=0;i<n1;i++){
			if(!hm.containsKey(ch1[i]))
			hm.put(ch1[i],1);
			else
				hm.put(ch1[i],hm.get(ch1[i])+1);	
			if(!hm.containsKey(ch2[i]))
				hm.put(ch2[i],-1);
			else
				hm.put(ch2[i],hm.get(ch2[i])-1);	
		}
		for(Map.Entry<Character, Integer>  it: hm.entrySet()){
			int val=it.getValue();
			if(val!=0)
				return false;
		}
		return true;
	}

	private static boolean checkAnangram(String str1, String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2)
			return false;
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<n1;i++){
				if(ch1[i]!=ch2[i])
					return false;
			}
			return true;
			
	}
}
