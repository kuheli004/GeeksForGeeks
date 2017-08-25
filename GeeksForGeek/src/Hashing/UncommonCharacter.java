package Hashing;

import java.util.HashMap;

import java.util.Map;


public class UncommonCharacter {

	public static void main(String[] args) {

		String str1="characters";
		String str2="alphabets";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
	
		Map<Character,Boolean> hs=new HashMap<Character,Boolean>();
		for(int i=0;i<ch1.length;i++) {
			if(!hs.containsKey(ch1[i]))
				hs.put(ch1[i], false);
			//hs.put(ch1[i], hs.get(ch1[i])+1);
		}
		System.out.println(hs);
		for(int i=0;i<ch2.length;i++) {
			if(!hs.containsKey(ch2[i]))
				System.out.println(ch2[i]);
			else {
				hs.put(ch2[i],true);
			}
				
		}
		
	
			for(Map.Entry<Character, Boolean> c:hs.entrySet()) {
				if(!c.getValue())
				System.out.println(c.getKey());
		
			}
	}

}
